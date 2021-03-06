package org.tc.osgi.bundle.hello.world.launcher.module.service;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import org.apache.log4j.Logger;
import org.osgi.framework.BundleContext;
import org.tc.osgi.bundle.utils.collection.Collections;
import org.tc.osgi.bundle.utils.collection.element.Pair;
import org.tc.osgi.bundle.utils.conf.XMLPropertyFile;
import org.tc.osgi.bundle.utils.context.BundleKiller;
import org.tc.osgi.bundle.utils.context.BundleStarter;
import org.tc.osgi.bundle.utils.exception.FieldTrackingAssignementException;
import org.tc.osgi.bundle.utils.logger.LoggerGestionnary;
import org.tc.osgi.bundle.utils.module.service.IUtilsService;
import org.tc.osgi.bundle.utils.serial.SerialTool;
import org.tc.osgi.bundle.utils.tools.Tools;

/**
 * UtilsServiceProxy.java.
 * @author collonville thomas
 * @version
 * @track
 */
public class UtilsServiceProxy implements IUtilsService {

    /**
     * UtilsServiceProxy instance.
     */
    private static UtilsServiceProxy instance = null;

    /**
     * getInstance.
     * @return UtilsServiceProxy
     */
    public static UtilsServiceProxy getInstance() {
        if (UtilsServiceProxy.instance == null) {
            UtilsServiceProxy.instance = new UtilsServiceProxy();
        }
        return UtilsServiceProxy.instance;
    }

    /**
     * IUtilsService service.
     */
    private IUtilsService service = null;

    /**
     * UtilsServiceProxy constructor.
     */
    private UtilsServiceProxy() {

    }

    /**
     * @return BundleContext
     * @throws FieldTrackingAssignementException
     * @throws MalformedURLException
     * @throws RemoteException
     * @throws NotBoundException
     * @throws NumberFormatException
     * @throws UnknownHostException
     * @see org.tc.osgi.bundle.utils.module.service.IUtilsService#getBundleContext()
     */
    @Override
    public BundleContext getBundleContext() throws FieldTrackingAssignementException, MalformedURLException, RemoteException,
        NotBoundException, NumberFormatException, UnknownHostException {
        return this.service.getBundleContext();
    }

	@Override
	public LoggerGestionnary getLoggerGestionnary() {
		return this.service.getLoggerGestionnary();
	}
    /**
     * @return BundleKiller
     * @see org.tc.osgi.bundle.utils.module.service.IUtilsService#getBundleKiller()
     */
    @Override
    public BundleKiller getBundleKiller() {
        return this.service.getBundleKiller();
    }

    /**
     * @return BundleStarter
     * @see org.tc.osgi.bundle.utils.module.service.IUtilsService#getBundleStarter()
     */
    @Override
    public BundleStarter getBundleStarter() {
        return this.service.getBundleStarter();
    }

    /**
     * @return Collections
     * @see org.tc.osgi.bundle.utils.module.service.IUtilsService#getCollectionTool()
     */
    @Override
    public Collections getCollectionTool() {
        return this.service.getCollectionTool();
    }

    /**
     * @param _class Class
     * @return Logger
     * @see org.tc.osgi.bundle.utils.module.service.IUtilsService#getLogger(java.lang.Class)
     */
    @Override
    public Logger getLogger(final Class _class) {
        return this.service.getLogger(_class);
    }

    /**
     * @param t T
     * @param n N
     * @return <T, N> Pair<T, N>
     * @see org.tc.osgi.bundle.utils.module.service.IUtilsService#getPair(java.lang.Object, java.lang.Object)
     */
    @Override
    public <T, N> Pair<T, N> getPair(final T t, final N n) {
        return this.service.getPair(t, n);
    }

    /**
     * @return <T extends Serializable>
     * @see org.tc.osgi.bundle.utils.module.service.IUtilsService#getSerialTool()
     */
    @Override
    public <T extends Serializable> SerialTool<T> getSerialTool() {
        return this.service.getSerialTool();
    }

    /**
     * getService.
     * @return IUtilsService
     */
    public IUtilsService getService() {
        return this.service;
    }

    /**
     * @return Tools
     * @see org.tc.osgi.bundle.utils.module.service.IUtilsService#getTool()
     */
    @Override
    public Tools getTool() {
        return this.service.getTool();
    }

    /**
     * @param propertyFileName String
     * @return XMLPropertyFile
     * @throws FieldTrackingAssignementException
     * @see org.tc.osgi.bundle.utils.module.service.IUtilsService#getXMLPropertyFile(java.lang.String)
     */
    @Override
    public XMLPropertyFile getXMLPropertyFile(final String propertyFileName) throws FieldTrackingAssignementException {
        return this.service.getXMLPropertyFile(propertyFileName);
    }

    /**
     * setService.
     * @param service IUtilsService
     */
    public void setService(final IUtilsService service) {
        this.service = service;
    }

}
