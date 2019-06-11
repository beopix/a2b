# a2b

The language a2b (ASCII to Binary) is a domain-specific language for generating binary files.<br>
The a2b-Compiler is the application for converting a language file (created with a2b) to a binary file.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development purposes.

### Prerequisites

What things you need to install the software and how to install them.

* [Java](https://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) - Java SE Development Kit 8
* [Xtext](https://www.eclipse.org/Xtext/download.html) - Xtext SDK 2.17.0

For Windows user

* [WinPcap](https://www.winpcap.org/install/default.htm) - If Wireshark is installed, WinPcap should be already on the maschine.

### Installing

A step by step series of examples that tell you how to get a development env running.

```
+ Pull this project.
+ Import them as Maven projects.
+ Now you can compile the project and generate Xtext Artifacts
```

## Built With

* [Eclipse EE IDE](https://www.eclipse.org/downloads/packages/) - Integrated development environment
* [Maven](https://maven.apache.org/) - Dependency Management
* [EGit](https://www.eclipse.org/egit/) - Git integration for Eclipse IDE

## Projects

* [a2b.application](https://github.com/beopix/a2b/tree/master/a2b.application) - a2b.jar file for generate a binary file from a language file.
* [a2b.compiler](https://github.com/beopix/a2b/tree/master/a2b.compiler) - a2b-Compiler project for the application <br>(compiler package - main core of app; decoder package - converter classes)
* [a2b.dsl](https://github.com/beopix/a2b/tree/master/a2b.dsl) - a2b language project (/a2b.dsl/src/a2b/A2B.xtext - thats the grammar file)
* [a2b.dsl.feature](https://github.com/beopix/a2b/tree/master/a2b.dsl.feature) - Project for generating an Eclipse plug-in for the language.
* [a2b.dsl.tests](https://github.com/beopix/a2b/tree/master/a2b.dsl.tests) - Project for testing the language syntax.
* [a2b.plugin](https://github.com/beopix/a2b/tree/master/a2b.plugin) - a2b language plug-in for Eclipse IDE.

## Usage

Decsibes how to use the a2b-Compiler.
```
C:\>java -jar a2b.jar languageFile.a2b toGeneratedBinaryFile.bin
```

## Concept

The a2b syntax has two main parts.<br>
The first is the instruction which defines how to writes the value into the generating binary file.<br>
The second part ist the value which will be written as bytes in the binary file.<br>

## Language

Some language files examples you can find [here](https://github.com/beopix/a2b/tree/master/a2b.compiler/src/main/resources).<br>
Further this are the supported instructions in a2b.

```
// short comment like in java

/*
 * longer comment
 * writes means that the command writes the value to the generating binary file 
 */
 
 // instructions for define byte, define word and define double word
 DB 255                        //writes a byte in decimal
 DB 0b11111111                 //writes a byte in binary
 DB 0xFF                       //no case sensitivity at the value
 DB 0xff                       //writes a byte in hexadecimal
 
 DW 65535                      //writes 2 bytes in decimal
 DW 0b1111111111111111         //writes 2 bytes in binary
 DW 0xFFFF                     //writes 2 bytes in hexadecimal
 
 DD 4294967295                 //writes 4 bytes in decimal
 //you can imagine for binary
 DD 0xFFFFFFFF                 //writes 4 bytes in hexadecimal
 
 
 // instructions for changing byte order (endianess) - default is big-endian
 LE                            //changes byte order to little-endian
 BE                            //changes byte order to big-endian
 
 
 // instructions for hardware-, protocol addresses
 IP 192.168.178.42             //writes an ip address
 MAC A1:B2:C3:D4:E5:F6         //writes an mac address
 
 
 // instructions for checksum calculation
 // CRC16
 CRC16 #                       //writes calculated 2 bytes checksum
 
 DB 0#                         //all fields with the same amount of the #-sign as in command will be added to calculation
 DD 0xFFFFFFFF#                    
 DB 54###                      //will not be presented in the calculation
 DW 0b0110011101010001#
 MAC 01:02:03:04:05:06#
 
 
 // CRC32
 CRC32 ##                       //writes calculated 4 bytes checksum
 
 IP 192.123.1.1##
 MAC 00:00:00:11:11:11##
 
 
 // instructions for Base64 encoding and decoding
 B64e "HelloWorld"              //writes encoded HelloWorld
 B64e 'HelloWorld'
 
 B64d "SGVsbG9Xb3JsZA=="        //writes decoded SGVsbG9Xb3JsZA==
 B64d 'SGVsbG9Xb3JsZA=='
 
 
 // other instructions
 PAD 15                         //writes 15 zero bytes
 
 
 INCLUDE /someFolder/someFile.dude  //adds existing file
 
 
 PCAP                           //instruction for generating the binary file as a pcap file
 
 
 STR "some String"              //writes a string
 STR 'some other String'
 
 
 PXL 0 128 255                  //writes 3 bytes in decimal
 PXL 255 255 255
 PXL 1 1 1
 
 
 HXS 0hffFF01A2B4C6             //writes a hexadecimal string, length can be variable
 HXS 0h01
 HXS 0hCC0025C4A7EE0000AABBCCDDEEFFaabbccddeeff00112233445566
 
 
 NL                             //instruction for a line break in the binary file
```

## License

This project is licensed under the BSD License - see the [LICENSE.md](LICENSE.md) file for details.

