/**
 * generated by Xtext 2.9.0
 */
package sysml.dml;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>S</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link sysml.dml.S#getSrc <em>Src</em>}</li>
 *   <li>{@link sysml.dml.S#getSrcid <em>Srcid</em>}</li>
 *   <li>{@link sysml.dml.S#getCwd <em>Cwd</em>}</li>
 *   <li>{@link sysml.dml.S#getIfe <em>Ife</em>}</li>
 *   <li>{@link sysml.dml.S#getIs <em>Is</em>}</li>
 *   <li>{@link sysml.dml.S#getEs <em>Es</em>}</li>
 *   <li>{@link sysml.dml.S#getFp <em>Fp</em>}</li>
 *   <li>{@link sysml.dml.S#getP <em>P</em>}</li>
 *   <li>{@link sysml.dml.S#getS <em>S</em>}</li>
 *   <li>{@link sysml.dml.S#getPf <em>Pf</em>}</li>
 *   <li>{@link sysml.dml.S#getWe <em>We</em>}</li>
 *   <li>{@link sysml.dml.S#getDi <em>Di</em>}</li>
 *   <li>{@link sysml.dml.S#getFc <em>Fc</em>}</li>
 *   <li>{@link sysml.dml.S#getLhsdi <em>Lhsdi</em>}</li>
 *   <li>{@link sysml.dml.S#getE <em>E</em>}</li>
 * </ul>
 *
 * @see sysml.dml.DmlPackage#getS()
 * @model
 * @generated
 */
public interface S extends EObject
{
  /**
   * Returns the value of the '<em><b>Src</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Src</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Src</em>' attribute.
   * @see #setSrc(String)
   * @see sysml.dml.DmlPackage#getS_Src()
   * @model
   * @generated
   */
  String getSrc();

  /**
   * Sets the value of the '{@link sysml.dml.S#getSrc <em>Src</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Src</em>' attribute.
   * @see #getSrc()
   * @generated
   */
  void setSrc(String value);

  /**
   * Returns the value of the '<em><b>Srcid</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Srcid</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Srcid</em>' containment reference.
   * @see #setSrcid(ID)
   * @see sysml.dml.DmlPackage#getS_Srcid()
   * @model containment="true"
   * @generated
   */
  ID getSrcid();

  /**
   * Sets the value of the '{@link sysml.dml.S#getSrcid <em>Srcid</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Srcid</em>' containment reference.
   * @see #getSrcid()
   * @generated
   */
  void setSrcid(ID value);

  /**
   * Returns the value of the '<em><b>Cwd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cwd</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cwd</em>' attribute.
   * @see #setCwd(String)
   * @see sysml.dml.DmlPackage#getS_Cwd()
   * @model
   * @generated
   */
  String getCwd();

  /**
   * Sets the value of the '{@link sysml.dml.S#getCwd <em>Cwd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cwd</em>' attribute.
   * @see #getCwd()
   * @generated
   */
  void setCwd(String value);

  /**
   * Returns the value of the '<em><b>Ife</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ife</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ife</em>' containment reference.
   * @see #setIfe(E)
   * @see sysml.dml.DmlPackage#getS_Ife()
   * @model containment="true"
   * @generated
   */
  E getIfe();

  /**
   * Sets the value of the '{@link sysml.dml.S#getIfe <em>Ife</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ife</em>' containment reference.
   * @see #getIfe()
   * @generated
   */
  void setIfe(E value);

  /**
   * Returns the value of the '<em><b>Is</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Is</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Is</em>' containment reference.
   * @see #setIs(BS)
   * @see sysml.dml.DmlPackage#getS_Is()
   * @model containment="true"
   * @generated
   */
  BS getIs();

  /**
   * Sets the value of the '{@link sysml.dml.S#getIs <em>Is</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Is</em>' containment reference.
   * @see #getIs()
   * @generated
   */
  void setIs(BS value);

  /**
   * Returns the value of the '<em><b>Es</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Es</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Es</em>' containment reference.
   * @see #setEs(BS)
   * @see sysml.dml.DmlPackage#getS_Es()
   * @model containment="true"
   * @generated
   */
  BS getEs();

  /**
   * Sets the value of the '{@link sysml.dml.S#getEs <em>Es</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Es</em>' containment reference.
   * @see #getEs()
   * @generated
   */
  void setEs(BS value);

  /**
   * Returns the value of the '<em><b>Fp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fp</em>' containment reference.
   * @see #setFp(FP)
   * @see sysml.dml.DmlPackage#getS_Fp()
   * @model containment="true"
   * @generated
   */
  FP getFp();

  /**
   * Sets the value of the '{@link sysml.dml.S#getFp <em>Fp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fp</em>' containment reference.
   * @see #getFp()
   * @generated
   */
  void setFp(FP value);

  /**
   * Returns the value of the '<em><b>P</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>P</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>P</em>' containment reference.
   * @see #setP(PARFORPARAMS)
   * @see sysml.dml.DmlPackage#getS_P()
   * @model containment="true"
   * @generated
   */
  PARFORPARAMS getP();

  /**
   * Sets the value of the '{@link sysml.dml.S#getP <em>P</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>P</em>' containment reference.
   * @see #getP()
   * @generated
   */
  void setP(PARFORPARAMS value);

  /**
   * Returns the value of the '<em><b>S</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>S</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>S</em>' containment reference.
   * @see #setS(BS)
   * @see sysml.dml.DmlPackage#getS_S()
   * @model containment="true"
   * @generated
   */
  BS getS();

  /**
   * Sets the value of the '{@link sysml.dml.S#getS <em>S</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>S</em>' containment reference.
   * @see #getS()
   * @generated
   */
  void setS(BS value);

  /**
   * Returns the value of the '<em><b>Pf</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pf</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pf</em>' containment reference.
   * @see #setPf(FP)
   * @see sysml.dml.DmlPackage#getS_Pf()
   * @model containment="true"
   * @generated
   */
  FP getPf();

  /**
   * Sets the value of the '{@link sysml.dml.S#getPf <em>Pf</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pf</em>' containment reference.
   * @see #getPf()
   * @generated
   */
  void setPf(FP value);

  /**
   * Returns the value of the '<em><b>We</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>We</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>We</em>' containment reference.
   * @see #setWe(E)
   * @see sysml.dml.DmlPackage#getS_We()
   * @model containment="true"
   * @generated
   */
  E getWe();

  /**
   * Sets the value of the '{@link sysml.dml.S#getWe <em>We</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>We</em>' containment reference.
   * @see #getWe()
   * @generated
   */
  void setWe(E value);

  /**
   * Returns the value of the '<em><b>Di</b></em>' containment reference list.
   * The list contents are of type {@link sysml.dml.DI}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Di</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Di</em>' containment reference list.
   * @see sysml.dml.DmlPackage#getS_Di()
   * @model containment="true"
   * @generated
   */
  EList<DI> getDi();

  /**
   * Returns the value of the '<em><b>Fc</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fc</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fc</em>' containment reference.
   * @see #setFc(FC)
   * @see sysml.dml.DmlPackage#getS_Fc()
   * @model containment="true"
   * @generated
   */
  FC getFc();

  /**
   * Sets the value of the '{@link sysml.dml.S#getFc <em>Fc</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fc</em>' containment reference.
   * @see #getFc()
   * @generated
   */
  void setFc(FC value);

  /**
   * Returns the value of the '<em><b>Lhsdi</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Lhsdi</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Lhsdi</em>' containment reference.
   * @see #setLhsdi(DI)
   * @see sysml.dml.DmlPackage#getS_Lhsdi()
   * @model containment="true"
   * @generated
   */
  DI getLhsdi();

  /**
   * Sets the value of the '{@link sysml.dml.S#getLhsdi <em>Lhsdi</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Lhsdi</em>' containment reference.
   * @see #getLhsdi()
   * @generated
   */
  void setLhsdi(DI value);

  /**
   * Returns the value of the '<em><b>E</b></em>' containment reference list.
   * The list contents are of type {@link sysml.dml.E}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>E</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>E</em>' containment reference list.
   * @see sysml.dml.DmlPackage#getS_E()
   * @model containment="true"
   * @generated
   */
  EList<E> getE();

} // S
