/**
 * generated by Xtext 2.17.0
 */
package a2b.a2B;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link a2b.a2B.Model#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see a2b.a2B.A2BPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' containment reference list.
   * The list contents are of type {@link a2b.a2B.Instruction}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' containment reference list.
   * @see a2b.a2B.A2BPackage#getModel_Element()
   * @model containment="true"
   * @generated
   */
  EList<Instruction> getElement();

} // Model
