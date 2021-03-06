/**
 * generated by Xtext 2.17.0
 */
package a2b.a2B;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a2b.a2B.IP#getValue <em>Value</em>}</li>
 *   <li>{@link a2b.a2B.IP#getCrcValue <em>Crc Value</em>}</li>
 * </ul>
 *
 * @see a2b.a2B.A2BPackage#getIP()
 * @model
 * @generated
 */
public interface IP extends Instruction
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(String)
   * @see a2b.a2B.A2BPackage#getIP_Value()
   * @model
   * @generated
   */
  String getValue();

  /**
   * Sets the value of the '{@link a2b.a2B.IP#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(String value);

  /**
   * Returns the value of the '<em><b>Crc Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Crc Value</em>' attribute.
   * @see #setCrcValue(String)
   * @see a2b.a2B.A2BPackage#getIP_CrcValue()
   * @model
   * @generated
   */
  String getCrcValue();

  /**
   * Sets the value of the '{@link a2b.a2B.IP#getCrcValue <em>Crc Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Crc Value</em>' attribute.
   * @see #getCrcValue()
   * @generated
   */
  void setCrcValue(String value);

} // IP
