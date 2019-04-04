/**
 * generated by Xtext 2.17.0
 */
package a2b.a2B;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DW</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a2b.a2B.DW#getStringValue <em>String Value</em>}</li>
 *   <li>{@link a2b.a2B.DW#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link a2b.a2B.DW#getCrcValue <em>Crc Value</em>}</li>
 * </ul>
 *
 * @see a2b.a2B.A2BPackage#getDW()
 * @model
 * @generated
 */
public interface DW extends Instruction
{
  /**
   * Returns the value of the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Value</em>' attribute.
   * @see #setStringValue(String)
   * @see a2b.a2B.A2BPackage#getDW_StringValue()
   * @model
   * @generated
   */
  String getStringValue();

  /**
   * Sets the value of the '{@link a2b.a2B.DW#getStringValue <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Value</em>' attribute.
   * @see #getStringValue()
   * @generated
   */
  void setStringValue(String value);

  /**
   * Returns the value of the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Value</em>' attribute.
   * @see #setIntValue(int)
   * @see a2b.a2B.A2BPackage#getDW_IntValue()
   * @model
   * @generated
   */
  int getIntValue();

  /**
   * Sets the value of the '{@link a2b.a2B.DW#getIntValue <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Value</em>' attribute.
   * @see #getIntValue()
   * @generated
   */
  void setIntValue(int value);

  /**
   * Returns the value of the '<em><b>Crc Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Crc Value</em>' attribute.
   * @see #setCrcValue(String)
   * @see a2b.a2B.A2BPackage#getDW_CrcValue()
   * @model
   * @generated
   */
  String getCrcValue();

  /**
   * Sets the value of the '{@link a2b.a2B.DW#getCrcValue <em>Crc Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Crc Value</em>' attribute.
   * @see #getCrcValue()
   * @generated
   */
  void setCrcValue(String value);

} // DW