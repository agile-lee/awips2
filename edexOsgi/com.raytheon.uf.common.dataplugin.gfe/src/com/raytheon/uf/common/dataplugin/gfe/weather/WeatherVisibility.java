/**
 * This software was developed and / or modified by Raytheon Company,
 * pursuant to Contract DG133W-05-CQ-1067 with the US Government.
 * 
 * U.S. EXPORT CONTROLLED TECHNICAL DATA
 * This software product contains export-restricted data whose
 * export/transfer/disclosure is restricted by U.S. law. Dissemination
 * to non-U.S. persons whether in the United States or abroad requires
 * an export license or other authorization.
 * 
 * Contractor Name:        Raytheon Company
 * Contractor Address:     6825 Pine Street, Suite 340
 *                         Mail Stop B8
 *                         Omaha, NE 68106
 *                         402.291.0100
 * 
 * See the AWIPS II Master Rights File ("Master Rights File.pdf") for
 * further licensing information.
 **/
package com.raytheon.uf.common.dataplugin.gfe.weather;

import com.raytheon.uf.common.dataplugin.gfe.DiscreteTerm;
import com.raytheon.uf.common.serialization.annotations.DynamicSerialize;

/**
 * WeatherVisibility
 * 
 * <pre>
 * 
 * SOFTWARE HISTORY
 * 
 * Date         Ticket#    Engineer    Description
 * ------------ ---------- ----------- --------------------------
 * Mar 14, 2011      #8156 randerso    Re-ported from AWIPS 1
 * 
 * </pre>
 * 
 * @author randerso
 * @version 1.0
 */

@DynamicSerialize
public class WeatherVisibility extends DiscreteTerm {
    public WeatherVisibility() {
        super();
    }

    public WeatherVisibility(String symbol) {
        super(symbol, null);
    }

    public WeatherVisibility(String symbol, String description) {
        super(symbol, description);
    }

}
