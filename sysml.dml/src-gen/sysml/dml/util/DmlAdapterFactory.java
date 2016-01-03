/**
 * generated by Xtext 2.9.0
 */
package sysml.dml.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import sysml.dml.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see sysml.dml.DmlPackage
 * @generated
 */
public class DmlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DmlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DmlPackage.eINSTANCE;
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
  protected DmlSwitch<Adapter> modelSwitch =
    new DmlSwitch<Adapter>()
    {
      @Override
      public Adapter caseD(D object)
      {
        return createDAdapter();
      }
      @Override
      public Adapter caseF(F object)
      {
        return createFAdapter();
      }
      @Override
      public Adapter caseS(S object)
      {
        return createSAdapter();
      }
      @Override
      public Adapter caseFC(FC object)
      {
        return createFCAdapter();
      }
      @Override
      public Adapter caseBS(BS object)
      {
        return createBSAdapter();
      }
      @Override
      public Adapter caseFP(FP object)
      {
        return createFPAdapter();
      }
      @Override
      public Adapter casePARFORPARAMS(PARFORPARAMS object)
      {
        return createPARFORPARAMSAdapter();
      }
      @Override
      public Adapter caseDI(DI object)
      {
        return createDIAdapter();
      }
      @Override
      public Adapter caseIS(IS object)
      {
        return createISAdapter();
      }
      @Override
      public Adapter casePL(PL object)
      {
        return createPLAdapter();
      }
      @Override
      public Adapter caseE(E object)
      {
        return createEAdapter();
      }
      @Override
      public Adapter caseTE(TE object)
      {
        return createTEAdapter();
      }
      @Override
      public Adapter caseSPKV(SPKV object)
      {
        return createSPKVAdapter();
      }
      @Override
      public Adapter casePE(PE object)
      {
        return createPEAdapter();
      }
      @Override
      public Adapter caseTAN(TAN object)
      {
        return createTANAdapter();
      }
      @Override
      public Adapter caseID(ID object)
      {
        return createIDAdapter();
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
   * Creates a new adapter for an object of class '{@link sysml.dml.D <em>D</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.D
   * @generated
   */
  public Adapter createDAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.F <em>F</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.F
   * @generated
   */
  public Adapter createFAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.S <em>S</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.S
   * @generated
   */
  public Adapter createSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.FC <em>FC</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.FC
   * @generated
   */
  public Adapter createFCAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.BS <em>BS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.BS
   * @generated
   */
  public Adapter createBSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.FP <em>FP</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.FP
   * @generated
   */
  public Adapter createFPAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.PARFORPARAMS <em>PARFORPARAMS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.PARFORPARAMS
   * @generated
   */
  public Adapter createPARFORPARAMSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.DI <em>DI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.DI
   * @generated
   */
  public Adapter createDIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.IS <em>IS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.IS
   * @generated
   */
  public Adapter createISAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.PL <em>PL</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.PL
   * @generated
   */
  public Adapter createPLAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.E <em>E</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.E
   * @generated
   */
  public Adapter createEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.TE <em>TE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.TE
   * @generated
   */
  public Adapter createTEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.SPKV <em>SPKV</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.SPKV
   * @generated
   */
  public Adapter createSPKVAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.PE <em>PE</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.PE
   * @generated
   */
  public Adapter createPEAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.TAN <em>TAN</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.TAN
   * @generated
   */
  public Adapter createTANAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link sysml.dml.ID <em>ID</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see sysml.dml.ID
   * @generated
   */
  public Adapter createIDAdapter()
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

} //DmlAdapterFactory
