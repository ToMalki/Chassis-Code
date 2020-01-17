package com.evergreen.robot;

import com.evergreen.everlib.shuffleboard.constants.ConstantDouble;
import com.evergreen.everlib.shuffleboard.constants.DashboardConstants;

/**
 * SubsystemConstants
 */
public interface SubsystemConstants {

    /**
     * SubsystemAConstant
     */
    public static class SubsystemAConstants {

        static
        {
            DashboardConstants.getInstance().startConstantsOf("SubsystemA");
        }

        
        // public static final double
        // ...

        // public static final ConstantDouble
        // ...
        
    }
    
    /**
     * SubsystemBConstant
     */
    public static class SubsystemBConstants {
        
        static
        {
            DashboardConstants.getInstance().startConstantsOf("SubsystemB");
        }

        // public static final ConstantDouble
        // ...

    }


    /**
     * SubsystemCConstants
     */
    public static class SubsystemCConstants {

        static
        {
            DashboardConstants.getInstance().startConstantsOf("SubsystemC");
        }

        // public static final ConstantDouble
        // ...
        
    }
}