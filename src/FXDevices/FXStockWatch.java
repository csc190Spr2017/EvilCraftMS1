/*
 * Copyright (C) 2019 csc190
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package FXDevices;

import BridgePattern.IStopWatch;

/**
 * FX implementation of IStopWatch
 * @author csc190
 */
public class FXStockWatch implements IStopWatch{
    //--- DATA MEMBERS -------------
    
    
    // ----------------- METHODS ----------------------------
    
    //--- OPERATOINS----------------
    public FXStockWatch(String name){
         throw new UnsupportedOperationException("Not implemented yet!");
    }

    @Override
    public void start() {
         throw new UnsupportedOperationException("Not implemented yet!");
    }

    @Override
    public void stop() {
         throw new UnsupportedOperationException("Not implemented yet!");
    }

    @Override
    public long getElapsed() {
         throw new UnsupportedOperationException("Not implemented yet!");
    }

    @Override
    public long getTotalElapsed() {
         throw new UnsupportedOperationException("Not implemented yet!");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not implemented yet!");
    }
    
}
