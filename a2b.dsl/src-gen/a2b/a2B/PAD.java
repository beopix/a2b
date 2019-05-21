/**
 * generated by Xtext 2.17.0
 */
package a2b.a2B;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PAD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a2b.a2B.PAD#getValue <em>Value</em>}</li>
 *   <li>{@link a2b.a2B.PAD#getCrcValue <em>Crc Value</em>}</li>
 * </ul>
 *
 * @see a2b.a2B.A2BPackage#getPAD()
 * @model
 * @generated
 */
public interface PAD extends Instruction
{
  /**
   * Returns the value of the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Value</em>' attribute.
   * @see #setValue(int)
   * @see a2b.a2B.A2BPackage#getPAD_Value()
   * @model
   * @generated
   */
  int getValue();

  /**
   * Sets the value of the '{@link a2b.a2B.PAD#getValue <em>Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Value</em>' attribute.
   * @see #getValue()
   * @generated
   */
  void setValue(int value);

  /**
   * Returns the value of the '<em><b>Crc Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Crc Value</em>' attribute.
   * @see #setCrcValue(String)
   * @see a2b.a2B.A2BPackage#getPAD_CrcValue()
   * @model
   * @generated
   */
  String getCrcValue();

  /**
   * Sets the value of the '{@link a2b.a2B.PAD#getCrcValue <em>Crc Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Crc Value</em>' attribute.
   * @see #getCrcValue()
   * @generated
   */
  void setCrcValue(String value);

} // PAD