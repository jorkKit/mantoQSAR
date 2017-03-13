/* This file is part of mantoQSAR.

mantoQSAR - Quantitative structure-activity relationship descriptor 
			calculation and modeling for biomolecules.
			
Copyright (C) 2016  Jörg Kittelmann


mantoQSAR is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, 
or any later version.

mantoQSAR is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with mantoQSAR. If not, see <http://www.gnu.org/licenses/>.
*/

package org.mantoQSAR.gui.molecule;

import java.awt.BorderLayout;
import org.netbeans.api.settings.ConvertAsProperties;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.windows.TopComponent;
import org.openide.util.NbBundle.Messages;

/**
 * Top component which displays something.
 */
@ConvertAsProperties(
        dtd = "-//org.mantoQSAR.gui//MoleculeSetting//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "MoleculeSettingTopComponent",
        //iconBase="SET/PATH/TO/ICON/HERE", 
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "editor", openAtStartup = true, position = 0)
@ActionID(category = "Window", id = "org.mantoQSAR.gui.MoleculeSettingTopComponent")
@ActionReference(path = "Menu/Window" /*, position = 333 */)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_MoleculeSettingAction",
        preferredID = "MoleculeSettingTopComponent"
)
@Messages({
    "CTL_MoleculeSettingAction=MoleculeSetting",
    "CTL_MoleculeSettingTopComponent=Molecule Setting",
    "HINT_MoleculeSettingTopComponent=This is the MoleculeSetting window"
})
public final class MoleculeSettingTopComponent extends TopComponent {

    public MoleculeSettingTopComponent() {
        initComponents();
        initMyComponents();
        setName(Bundle.CTL_MoleculeSettingTopComponent());
        setToolTipText(Bundle.HINT_MoleculeSettingTopComponent());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 457, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 302, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    MoleculeController moleculeControl; 
    
    private void initMyComponents(){
 
        MoleculeContentGroupPanel moleculeListPanel = new MoleculeContentGroupPanel();
        
        this.setLayout(new BorderLayout());
        this.add(moleculeListPanel, BorderLayout.CENTER);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        // TODO add custom code on component opening
    }

    @Override
    public void componentClosed() {
        // TODO add custom code on component closing
    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }
}