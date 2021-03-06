/**
 * generated by Xtext 2.9.0
 */
package sysml.dml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>D</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysml.dml.D#getF <em>F</em>}</li>
 *   <li>{@link sysml.dml.D#getS <em>S</em>}</li>
 * </ul>
 *
 * @see sysml.dml.DmlPackage#getD()
 * @model
 * @generated
 */
public interface D extends EObject
{
  /**
   * Returns the value of the '<em><b>F</b></em>' containment reference list.
   * The list contents are of type {@link sysml.dml.F}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>F</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>F</em>' containment reference list.
   * @see sysml.dml.DmlPackage#getD_F()
   * @model containment="true"
   * @generated
   */
  EList<F> getF();

  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference list.
   * The list contents are of type {@link sysml.dml.S}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference list.
   * @see sysml.dml.DmlPackage#getD_S()
   * @model containment="true"
   * @generated
   */
  EList<S> getS();

} // D
