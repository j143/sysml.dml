/**
 * generated by Xtext 2.9.0
 */
package sysml.dml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import sysml.dml.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmlFactoryImpl extends EFactoryImpl implements DmlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DmlFactory init()
  {
    try
    {
      DmlFactory theDmlFactory = (DmlFactory)EPackage.Registry.INSTANCE.getEFactory(DmlPackage.eNS_URI);
      if (theDmlFactory != null)
      {
        return theDmlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DmlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DmlPackage.D: return createD();
      case DmlPackage.F: return createF();
      case DmlPackage.S: return createS();
      case DmlPackage.FC: return createFC();
      case DmlPackage.BS: return createBS();
      case DmlPackage.FP: return createFP();
      case DmlPackage.PARFORPARAMS: return createPARFORPARAMS();
      case DmlPackage.DI: return createDI();
      case DmlPackage.IS: return createIS();
      case DmlPackage.PL: return createPL();
      case DmlPackage.E: return createE();
      case DmlPackage.TE: return createTE();
      case DmlPackage.SPKV: return createSPKV();
      case DmlPackage.PE: return createPE();
      case DmlPackage.TAN: return createTAN();
      case DmlPackage.ID: return createID();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public D createD()
  {
    DImpl d = new DImpl();
    return d;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public F createF()
  {
    FImpl f = new FImpl();
    return f;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public S createS()
  {
    SImpl s = new SImpl();
    return s;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FC createFC()
  {
    FCImpl fc = new FCImpl();
    return fc;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BS createBS()
  {
    BSImpl bs = new BSImpl();
    return bs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public FP createFP()
  {
    FPImpl fp = new FPImpl();
    return fp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PARFORPARAMS createPARFORPARAMS()
  {
    PARFORPARAMSImpl parforparams = new PARFORPARAMSImpl();
    return parforparams;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DI createDI()
  {
    DIImpl di = new DIImpl();
    return di;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IS createIS()
  {
    ISImpl is = new ISImpl();
    return is;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PL createPL()
  {
    PLImpl pl = new PLImpl();
    return pl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public E createE()
  {
    EImpl e = new EImpl();
    return e;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TE createTE()
  {
    TEImpl te = new TEImpl();
    return te;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SPKV createSPKV()
  {
    SPKVImpl spkv = new SPKVImpl();
    return spkv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PE createPE()
  {
    PEImpl pe = new PEImpl();
    return pe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TAN createTAN()
  {
    TANImpl tan = new TANImpl();
    return tan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ID createID()
  {
    IDImpl id = new IDImpl();
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmlPackage getDmlPackage()
  {
    return (DmlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DmlPackage getPackage()
  {
    return DmlPackage.eINSTANCE;
  }

} //DmlFactoryImpl
