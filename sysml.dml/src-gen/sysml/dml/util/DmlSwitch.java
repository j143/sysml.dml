/**
 * generated by Xtext 2.9.0
 */
package sysml.dml.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import sysml.dml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see sysml.dml.DmlPackage
 * @generated
 */
public class DmlSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DmlPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmlSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = DmlPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case DmlPackage.D:
      {
        D d = (D)theEObject;
        T result = caseD(d);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.F:
      {
        F f = (F)theEObject;
        T result = caseF(f);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.S:
      {
        S s = (S)theEObject;
        T result = caseS(s);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.FC:
      {
        FC fc = (FC)theEObject;
        T result = caseFC(fc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.BS:
      {
        BS bs = (BS)theEObject;
        T result = caseBS(bs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.FP:
      {
        FP fp = (FP)theEObject;
        T result = caseFP(fp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.PARFORPARAMS:
      {
        PARFORPARAMS parforparams = (PARFORPARAMS)theEObject;
        T result = casePARFORPARAMS(parforparams);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.DI:
      {
        DI di = (DI)theEObject;
        T result = caseDI(di);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.IS:
      {
        IS is = (IS)theEObject;
        T result = caseIS(is);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.PL:
      {
        PL pl = (PL)theEObject;
        T result = casePL(pl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.E:
      {
        E e = (E)theEObject;
        T result = caseE(e);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.TE:
      {
        TE te = (TE)theEObject;
        T result = caseTE(te);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.SPKV:
      {
        SPKV spkv = (SPKV)theEObject;
        T result = caseSPKV(spkv);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.PE:
      {
        PE pe = (PE)theEObject;
        T result = casePE(pe);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.TAN:
      {
        TAN tan = (TAN)theEObject;
        T result = caseTAN(tan);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case DmlPackage.ID:
      {
        ID id = (ID)theEObject;
        T result = caseID(id);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>D</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>D</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseD(D object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>F</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>F</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseF(F object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>S</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>S</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseS(S object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FC</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FC</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFC(FC object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>BS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>BS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBS(BS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>FP</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>FP</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFP(FP object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PARFORPARAMS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PARFORPARAMS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePARFORPARAMS(PARFORPARAMS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>DI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>DI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDI(DI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>IS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>IS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIS(IS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PL</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PL</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePL(PL object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>E</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>E</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseE(E object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTE(TE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>SPKV</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>SPKV</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSPKV(SPKV object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>PE</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>PE</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePE(PE object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>TAN</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>TAN</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTAN(TAN object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>ID</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>ID</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseID(ID object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //DmlSwitch
