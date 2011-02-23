/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hudson.scm;

import hudson.model.Action;

/**
 *
 * @author mtiamben
 */
public class SameRevisionAction implements Action{

    String mystring = null;
    public SameRevisionAction(String mystring) {
        this.mystring = mystring;
    }


    public String getIconFileName() {
        return null;
    }

    public String getDisplayName() {
        return null;
    }

    public String getUrlName() {
        return null;
    }

}
