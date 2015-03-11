/*******************************************************************************
 * Copyright 2015 Barcelona Supercomputing Center (BSC)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package com.servioticy.datamodel;

import java.util.ArrayList;

/**
 * @author Álvaro Villalba Navarro <alvaro.villalba@bsc.es>
 *
 */
public class Aggregate {
    private int maxWindowSize;
    private ArrayList<String> prepares;
    private String semigroup;
    private ArrayList<String> presents;

    public int getMaxWindowSize() {
        return maxWindowSize;
    }

    public void setMaxWindowSize(int maxWindowSize) {
        this.maxWindowSize = maxWindowSize;
    }

    public ArrayList<String> getPrepares() {
        return prepares;
    }

    public void setPrepares(ArrayList<String> prepares) {
        this.prepares = prepares;
    }

    public String getSemigroup() {
        return semigroup;
    }

    public void setSemigroup(String semigroup) {
        this.semigroup = semigroup;
    }

    public ArrayList<String> getPresents() {
        return presents;
    }

    public void setPresents(ArrayList<String> presents) {
        this.presents = presents;
    }
}
