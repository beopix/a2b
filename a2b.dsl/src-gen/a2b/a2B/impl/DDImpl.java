/**
 * generated by Xtext 2.17.0
 */
package a2b.a2B.impl;

import a2b.a2B.A2BPackage;
import a2b.a2B.DD;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link a2b.a2B.impl.DDImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link a2b.a2B.impl.DDImpl#getLongValue <em>Long Value</em>}</li>
 *   <li>{@link a2b.a2B.impl.DDImpl#getCrcValue <em>Crc Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DDImpl extends InstructionImpl implements DD
{
  /**
   * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected static final String STRING_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected String stringValue = STRING_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getLongValue() <em>Long Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongValue()
   * @generated
   * @ordered
   */
  protected static final long LONG_VALUE_EDEFAULT = 0L;

  /**
   * The cached value of the '{@link #getLongValue() <em>Long Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLongValue()
   * @generated
   * @ordered
   */
  protected long longValue = LONG_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getCrcValue() <em>Crc Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCrcValue()
   * @generated
   * @ordered
   */
  protected static final String CRC_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCrcValue() <em>Crc Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCrcValue()
   * @generated
   * @ordered
   */
  protected String crcValue = CRC_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DDImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return A2BPackage.Literals.DD;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStringValue()
  {
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStringValue(String newStringValue)
  {
    String oldStringValue = stringValue;
    stringValue = newStringValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, A2BPackage.DD__STRING_VALUE, oldStringValue, stringValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public long getLongValue()
  {
    return longValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setLongValue(long newLongValue)
  {
    long oldLongValue = longValue;
    longValue = newLongValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, A2BPackage.DD__LONG_VALUE, oldLongValue, longValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getCrcValue()
  {
    return crcValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCrcValue(String newCrcValue)
  {
    String oldCrcValue = crcValue;
    crcValue = newCrcValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, A2BPackage.DD__CRC_VALUE, oldCrcValue, crcValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case A2BPackage.DD__STRING_VALUE:
        return getStringValue();
      case A2BPackage.DD__LONG_VALUE:
        return getLongValue();
      case A2BPackage.DD__CRC_VALUE:
        return getCrcValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case A2BPackage.DD__STRING_VALUE:
        setStringValue((String)newValue);
        return;
      case A2BPackage.DD__LONG_VALUE:
        setLongValue((Long)newValue);
        return;
      case A2BPackage.DD__CRC_VALUE:
        setCrcValue((String)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case A2BPackage.DD__STRING_VALUE:
        setStringValue(STRING_VALUE_EDEFAULT);
        return;
      case A2BPackage.DD__LONG_VALUE:
        setLongValue(LONG_VALUE_EDEFAULT);
        return;
      case A2BPackage.DD__CRC_VALUE:
        setCrcValue(CRC_VALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case A2BPackage.DD__STRING_VALUE:
        return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
      case A2BPackage.DD__LONG_VALUE:
        return longValue != LONG_VALUE_EDEFAULT;
      case A2BPackage.DD__CRC_VALUE:
        return CRC_VALUE_EDEFAULT == null ? crcValue != null : !CRC_VALUE_EDEFAULT.equals(crcValue);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (stringValue: ");
    result.append(stringValue);
    result.append(", longValue: ");
    result.append(longValue);
    result.append(", crcValue: ");
    result.append(crcValue);
    result.append(')');
    return result.toString();
  }

} //DDImpl