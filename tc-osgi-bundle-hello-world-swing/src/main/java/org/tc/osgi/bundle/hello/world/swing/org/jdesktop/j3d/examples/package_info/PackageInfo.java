/*
 * $RCSfile: PackageInfo.java,v $
 *
 * Copyright (c) 2007 Sun Microsystems, Inc. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * - Redistribution of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * - Redistribution in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in
 *   the documentation and/or other materials provided with the
 *   distribution.
 *
 * Neither the name of Sun Microsystems, Inc. or the names of
 * contributors may be used to endorse or promote products derived
 * from this software without specific prior written permission.
 *
 * This software is provided "AS IS," without a warranty of any
 * kind. ALL EXPRESS OR IMPLIED CONDITIONS, REPRESENTATIONS AND
 * WARRANTIES, INCLUDING ANY IMPLIED WARRANTY OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE OR NON-INFRINGEMENT, ARE HEREBY
 * EXCLUDED. SUN MICROSYSTEMS, INC. ("SUN") AND ITS LICENSORS SHALL
 * NOT BE LIABLE FOR ANY DAMAGES SUFFERED BY LICENSEE AS A RESULT OF
 * USING, MODIFYING OR DISTRIBUTING THIS SOFTWARE OR ITS
 * DERIVATIVES. IN NO EVENT WILL SUN OR ITS LICENSORS BE LIABLE FOR
 * ANY LOST REVENUE, PROFIT OR DATA, OR FOR DIRECT, INDIRECT, SPECIAL,
 * CONSEQUENTIAL, INCIDENTAL OR PUNITIVE DAMAGES, HOWEVER CAUSED AND
 * REGARDLESS OF THE THEORY OF LIABILITY, ARISING OUT OF THE USE OF OR
 * INABILITY TO USE THIS SOFTWARE, EVEN IF SUN HAS BEEN ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGES.
 *
 * You acknowledge that this software is not designed, licensed or
 * intended for use in the design, construction, operation or
 * maintenance of any nuclear facility.
 *
 * $Revision: 1.3 $
 * $Date: 2007/02/09 17:21:46 $
 * $State: Exp $
 */

package org.jdesktop.j3d.examples.package_info;

import javax.swing.JTextArea;

public class PackageInfo extends javax.swing.JFrame {

    private void pkgInfo(JTextArea textArea,
            ClassLoader classLoader,
            String pkgName,
            String className) {

        try {
            classLoader.loadClass(pkgName + "." + className);

            Package p = Package.getPackage(pkgName);
            if (p == null) {
                textArea.append("WARNING: Package.getPackage(" +
                        pkgName +
                        ") is null\n");
            } else {
                textArea.append(p.toString() + "\n");
                textArea.append("Specification Title = " +
                        p.getSpecificationTitle() + "\n");
                textArea.append("Specification Vendor = " +
                        p.getSpecificationVendor() + "\n");
                textArea.append("Specification Version = " +
                        p.getSpecificationVersion() + "\n");

                textArea.append("Implementation Vendor = " +
                        p.getImplementationVendor() + "\n");
                textArea.append("Implementation Version = " +
                        p.getImplementationVersion() + "\n");
            }
        } catch (ClassNotFoundException e) {
            textArea.append("Unable to load " + pkgName + "\n");
        }

        textArea.append("\n");
    }

    /**
     * Creates new form PackageInfo
     */
    public PackageInfo() {
        initComponents();

	ClassLoader classLoader = getClass().getClassLoader();

	pkgInfo(myTextArea, classLoader, "javax.vecmath", "Point3d");
	pkgInfo(myTextArea, classLoader, "javax.media.j3d", "SceneGraphObject");
	pkgInfo(myTextArea, classLoader, "com.sun.j3d.utils.universe", "SimpleUniverse");
    }

    // ----------------------------------------------------------------
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        myTextArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Package Info");
        jScrollPane1.setPreferredSize(new java.awt.Dimension(400, 400));
        myTextArea.setColumns(20);
        myTextArea.setEditable(false);
        myTextArea.setRows(5);
        jScrollPane1.setViewportView(myTextArea);

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PackageInfo().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea myTextArea;
    // End of variables declaration//GEN-END:variables
    
}
