/**
 * generated by Xtext 2.17.0
 */
package a2b.a2B.util;

import a2b.a2B.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see a2b.a2B.A2BPackage
 * @generated
 */
public class A2BAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static A2BPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public A2BAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = A2BPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected A2BSwitch<Adapter> modelSwitch =
    new A2BSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseInstruction(Instruction object)
      {
        return createInstructionAdapter();
      }
      @Override
      public Adapter caseDB(DB object)
      {
        return createDBAdapter();
      }
      @Override
      public Adapter caseBase64(Base64 object)
      {
        return createBase64Adapter();
      }
      @Override
      public Adapter caseORG(ORG object)
      {
        return createORGAdapter();
      }
      @Override
      public Adapter caseINCLUDE(INCLUDE object)
      {
        return createINCLUDEAdapter();
      }
      @Override
      public Adapter caseMAC(MAC object)
      {
        return createMACAdapter();
      }
      @Override
      public Adapter caseIP(IP object)
      {
        return createIPAdapter();
      }
      @Override
      public Adapter caseHXS(HXS object)
      {
        return createHXSAdapter();
      }
      @Override
      public Adapter caseBE(BE object)
      {
        return createBEAdapter();
      }
      @Override
      public Adapter caseLE(LE object)
      {
        return createLEAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link a2b.a2B.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see a2b.a2B.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link a2b.a2B.Instruction <em>Instruction</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see a2b.a2B.Instruction
   * @generated
   */
  public Adapter createInstructionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link a2b.a2B.DB <em>DB</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see a2b.a2B.DB
   * @generated
   */
  public Adapter createDBAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link a2b.a2B.Base64 <em>Base64</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see a2b.a2B.Base64
   * @generated
   */
  public Adapter createBase64Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link a2b.a2B.ORG <em>ORG</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see a2b.a2B.ORG
   * @generated
   */
  public Adapter createORGAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link a2b.a2B.INCLUDE <em>INCLUDE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see a2b.a2B.INCLUDE
   * @generated
   */
  public Adapter createINCLUDEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link a2b.a2B.MAC <em>MAC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see a2b.a2B.MAC
   * @generated
   */
  public Adapter createMACAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link a2b.a2B.IP <em>IP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see a2b.a2B.IP
   * @generated
   */
  public Adapter createIPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link a2b.a2B.HXS <em>HXS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see a2b.a2B.HXS
   * @generated
   */
  public Adapter createHXSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link a2b.a2B.BE <em>BE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see a2b.a2B.BE
   * @generated
   */
  public Adapter createBEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link a2b.a2B.LE <em>LE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see a2b.a2B.LE
   * @generated
   */
  public Adapter createLEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //A2BAdapterFactory
