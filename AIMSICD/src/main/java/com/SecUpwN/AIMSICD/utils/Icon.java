/* Android IMSI-Catcher Detector | (c) AIMSICD Privacy Project
 * -----------------------------------------------------------
 * LICENSE:  http://git.io/vki47 | TERMS:  http://git.io/vki4o
 * -----------------------------------------------------------
 */
package com.SecUpwN.AIMSICD.utils;

import com.SecUpwN.AIMSICD.AppAIMSICD;
import com.SecUpwN.AIMSICD.R;

/**
 * Class that holds and returns the correct icon based on requested icon format and
 * current system status.
 *
 * @author Tor Henning Ueland
 */
public class Icon {
    public enum Type {
        FLAT,
        SENSE,
        WHITE,
    }

    /*
     * Returns a icon of the Type $t, what kind of icon is returned is decided
     * from what the current status is.
     */
    // TODO: Seem we're missing the other colors here: ORANGE and BLACK (skull)
    // See: https://github.com/SecUpwN/Android-IMSI-Catcher-Detector/wiki/Status-Icons
    // Dependencies:  Status.java, CellTracker.java, Icon.java ( + others?)
    // They should be based on the detection scores here: <TBA>
    // -- E:V:A 2015-01-19
    public static int getIcon(Type t) {
        switch(t) {
            case FLAT:
                switch (AppAIMSICD.getInstance().getStatus()) {
                    case IDLE:
                        return R.drawable.flat_idle;

                    case OK:
                        return R.drawable.flat_ok;

                    case MEDIUM:
                        return R.drawable.flat_medium;

                    case DANGER:
                        return R.drawable.flat_danger;

                    default:
                        return R.drawable.flat_idle;
                }

            case SENSE:
                switch (AppAIMSICD.getInstance().getStatus()) {
                    case IDLE:
                        return R.drawable.sense_idle;

                    case OK:
                        return R.drawable.sense_ok;

                    case MEDIUM:
                        return R.drawable.sense_medium;

                    case DANGER:
                        return R.drawable.sense_danger;

                    default:
                        return R.drawable.sense_idle;
                }

            case WHITE:
                switch (AppAIMSICD.getInstance().getStatus()) {
                    case IDLE:
                        return R.drawable.white_idle;

                    case OK:
                        return R.drawable.white_ok;

                    case MEDIUM:
                        return R.drawable.white_medium;

                    case DANGER:
                        return R.drawable.white_danger;

                    default:
                        return R.drawable.white_idle;
                }
        }
        return -1;
    }
}
