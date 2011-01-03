/**
 * This file is part of jCGT (the Java Cooperative Game Theory library).
 *
 * jCGT is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * jCGT is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.

 * You should have received a copy of the GNU Lesser General Public License
 * along with jCGT.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package cooperativegametheory.gui;

import cooperativegametheory.coalitionfunctions.CoalitionFunction;

/**
 *
 * @author jonas
 */
public class CFSettingsMyerson extends CFSettingsMeta {

    /** Creates new form CFSettings */
    public CFSettingsMyerson(CFSettingsPanel subGame) {
        initComponents();
        setSubGame(subGame);
        networkPanel.add(new CFSettingsNetwork());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        subGamePanel = new javax.swing.JScrollPane();
        networkPanel = new javax.swing.JScrollPane();

        subGamePanel.setBackground(java.awt.SystemColor.window);
        subGamePanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Sub Game"));

        networkPanel.setBackground(java.awt.SystemColor.window);
        networkPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Network"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(subGamePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
            .addComponent(networkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(subGamePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(networkPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane networkPanel;
    private javax.swing.JScrollPane subGamePanel;
    // End of variables declaration//GEN-END:variables

    public void setSubGame(CFSettingsPanel subGame){
        subGamePanel.removeAll();
        subGamePanel.add(subGame);
    }

    public CoalitionFunction getCF() {
        return null;
    }
}