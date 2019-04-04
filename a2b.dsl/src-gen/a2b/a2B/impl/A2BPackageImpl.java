/**
 * generated by Xtext 2.17.0
 */
package a2b.a2B.impl;

import a2b.a2B.A2BFactory;
import a2b.a2B.A2BPackage;
import a2b.a2B.Base64;
import a2b.a2B.Instruction;
import a2b.a2B.Model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class A2BPackageImpl extends EPackageImpl implements A2BPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dbEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dwEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ddEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass strEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass base64EClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass orgEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass includeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass macEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ipEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass hxsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass leEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pcapEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass crcEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see a2b.a2B.A2BPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private A2BPackageImpl()
  {
    super(eNS_URI, A2BFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link A2BPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static A2BPackage init()
  {
    if (isInited) return (A2BPackage)EPackage.Registry.INSTANCE.getEPackage(A2BPackage.eNS_URI);

    // Obtain or create and register package
    Object registeredA2BPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    A2BPackageImpl theA2BPackage = registeredA2BPackage instanceof A2BPackageImpl ? (A2BPackageImpl)registeredA2BPackage : new A2BPackageImpl();

    isInited = true;

    // Create package meta-data objects
    theA2BPackage.createPackageContents();

    // Initialize created meta-data
    theA2BPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theA2BPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(A2BPackage.eNS_URI, theA2BPackage);
    return theA2BPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getModel()
  {
    return modelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getModel_Element()
  {
    return (EReference)modelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getInstruction()
  {
    return instructionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDB()
  {
    return dbEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDB_StringValue()
  {
    return (EAttribute)dbEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDB_IntValue()
  {
    return (EAttribute)dbEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDB_CrcValue()
  {
    return (EAttribute)dbEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDW()
  {
    return dwEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDW_StringValue()
  {
    return (EAttribute)dwEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDW_IntValue()
  {
    return (EAttribute)dwEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDW_CrcValue()
  {
    return (EAttribute)dwEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDD()
  {
    return ddEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDD_StringValue()
  {
    return (EAttribute)ddEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDD_LongValue()
  {
    return (EAttribute)ddEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDD_CrcValue()
  {
    return (EAttribute)ddEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getSTR()
  {
    return strEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getSTR_Value()
  {
    return (EAttribute)strEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBase64()
  {
    return base64EClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getBase64_Value()
  {
    return (EAttribute)base64EClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getORG()
  {
    return orgEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getORG_Value()
  {
    return (EAttribute)orgEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getORG_CrcValue()
  {
    return (EAttribute)orgEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getINCLUDE()
  {
    return includeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getINCLUDE_Value()
  {
    return (EAttribute)includeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getMAC()
  {
    return macEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMAC_Value()
  {
    return (EAttribute)macEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getMAC_CrcValue()
  {
    return (EAttribute)macEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getIP()
  {
    return ipEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIP_Value()
  {
    return (EAttribute)ipEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getIP_CrcValue()
  {
    return (EAttribute)ipEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getHXS()
  {
    return hxsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHXS_Value()
  {
    return (EAttribute)hxsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getHXS_CrcValue()
  {
    return (EAttribute)hxsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getBE()
  {
    return beEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getLE()
  {
    return leEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getPCAP()
  {
    return pcapEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getCRC()
  {
    return crcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public A2BFactory getA2BFactory()
  {
    return (A2BFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelEClass = createEClass(MODEL);
    createEReference(modelEClass, MODEL__ELEMENT);

    instructionEClass = createEClass(INSTRUCTION);

    dbEClass = createEClass(DB);
    createEAttribute(dbEClass, DB__STRING_VALUE);
    createEAttribute(dbEClass, DB__INT_VALUE);
    createEAttribute(dbEClass, DB__CRC_VALUE);

    dwEClass = createEClass(DW);
    createEAttribute(dwEClass, DW__STRING_VALUE);
    createEAttribute(dwEClass, DW__INT_VALUE);
    createEAttribute(dwEClass, DW__CRC_VALUE);

    ddEClass = createEClass(DD);
    createEAttribute(ddEClass, DD__STRING_VALUE);
    createEAttribute(ddEClass, DD__LONG_VALUE);
    createEAttribute(ddEClass, DD__CRC_VALUE);

    strEClass = createEClass(STR);
    createEAttribute(strEClass, STR__VALUE);

    base64EClass = createEClass(BASE64);
    createEAttribute(base64EClass, BASE64__VALUE);

    orgEClass = createEClass(ORG);
    createEAttribute(orgEClass, ORG__VALUE);
    createEAttribute(orgEClass, ORG__CRC_VALUE);

    includeEClass = createEClass(INCLUDE);
    createEAttribute(includeEClass, INCLUDE__VALUE);

    macEClass = createEClass(MAC);
    createEAttribute(macEClass, MAC__VALUE);
    createEAttribute(macEClass, MAC__CRC_VALUE);

    ipEClass = createEClass(IP);
    createEAttribute(ipEClass, IP__VALUE);
    createEAttribute(ipEClass, IP__CRC_VALUE);

    hxsEClass = createEClass(HXS);
    createEAttribute(hxsEClass, HXS__VALUE);
    createEAttribute(hxsEClass, HXS__CRC_VALUE);

    beEClass = createEClass(BE);

    leEClass = createEClass(LE);

    pcapEClass = createEClass(PCAP);

    crcEClass = createEClass(CRC);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    dbEClass.getESuperTypes().add(this.getInstruction());
    dwEClass.getESuperTypes().add(this.getInstruction());
    ddEClass.getESuperTypes().add(this.getInstruction());
    strEClass.getESuperTypes().add(this.getInstruction());
    base64EClass.getESuperTypes().add(this.getInstruction());
    orgEClass.getESuperTypes().add(this.getInstruction());
    includeEClass.getESuperTypes().add(this.getInstruction());
    macEClass.getESuperTypes().add(this.getInstruction());
    ipEClass.getESuperTypes().add(this.getInstruction());
    hxsEClass.getESuperTypes().add(this.getInstruction());
    beEClass.getESuperTypes().add(this.getInstruction());
    leEClass.getESuperTypes().add(this.getInstruction());
    pcapEClass.getESuperTypes().add(this.getInstruction());
    crcEClass.getESuperTypes().add(this.getInstruction());

    // Initialize classes and features; add operations and parameters
    initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModel_Element(), this.getInstruction(), null, "element", null, 0, -1, Model.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(instructionEClass, Instruction.class, "Instruction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(dbEClass, a2b.a2B.DB.class, "DB", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDB_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, a2b.a2B.DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDB_IntValue(), ecorePackage.getEInt(), "intValue", null, 0, 1, a2b.a2B.DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDB_CrcValue(), ecorePackage.getEString(), "crcValue", null, 0, 1, a2b.a2B.DB.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(dwEClass, a2b.a2B.DW.class, "DW", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDW_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, a2b.a2B.DW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDW_IntValue(), ecorePackage.getEInt(), "intValue", null, 0, 1, a2b.a2B.DW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDW_CrcValue(), ecorePackage.getEString(), "crcValue", null, 0, 1, a2b.a2B.DW.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ddEClass, a2b.a2B.DD.class, "DD", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDD_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, a2b.a2B.DD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDD_LongValue(), ecorePackage.getELong(), "longValue", null, 0, 1, a2b.a2B.DD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDD_CrcValue(), ecorePackage.getEString(), "crcValue", null, 0, 1, a2b.a2B.DD.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(strEClass, a2b.a2B.STR.class, "STR", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSTR_Value(), ecorePackage.getEString(), "value", null, 0, 1, a2b.a2B.STR.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(base64EClass, Base64.class, "Base64", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getBase64_Value(), ecorePackage.getEString(), "value", null, 0, 1, Base64.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(orgEClass, a2b.a2B.ORG.class, "ORG", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getORG_Value(), ecorePackage.getEInt(), "value", null, 0, 1, a2b.a2B.ORG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getORG_CrcValue(), ecorePackage.getEString(), "crcValue", null, 0, 1, a2b.a2B.ORG.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(includeEClass, a2b.a2B.INCLUDE.class, "INCLUDE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getINCLUDE_Value(), ecorePackage.getEString(), "value", null, 0, 1, a2b.a2B.INCLUDE.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(macEClass, a2b.a2B.MAC.class, "MAC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getMAC_Value(), ecorePackage.getEString(), "value", null, 0, 1, a2b.a2B.MAC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMAC_CrcValue(), ecorePackage.getEString(), "crcValue", null, 0, 1, a2b.a2B.MAC.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ipEClass, a2b.a2B.IP.class, "IP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getIP_Value(), ecorePackage.getEString(), "value", null, 0, 1, a2b.a2B.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getIP_CrcValue(), ecorePackage.getEString(), "crcValue", null, 0, 1, a2b.a2B.IP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(hxsEClass, a2b.a2B.HXS.class, "HXS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getHXS_Value(), ecorePackage.getEString(), "value", null, 0, 1, a2b.a2B.HXS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getHXS_CrcValue(), ecorePackage.getEString(), "crcValue", null, 0, 1, a2b.a2B.HXS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beEClass, a2b.a2B.BE.class, "BE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(leEClass, a2b.a2B.LE.class, "LE", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pcapEClass, a2b.a2B.PCAP.class, "PCAP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(crcEClass, a2b.a2B.CRC.class, "CRC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //A2BPackageImpl
