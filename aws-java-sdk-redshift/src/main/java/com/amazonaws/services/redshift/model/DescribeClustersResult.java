/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.redshift.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the output from the DescribeClusters action.
 * </p>
 */
public class DescribeClustersResult implements Serializable, Cloneable {

    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     */
    private String marker;

    /**
     * A list of <a>Cluster</a> objects, where each object describes one
     * cluster.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Cluster> clusters;

    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     *
     * @return A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the
     *         command. If the <code>Marker</code> field is empty, all response
     *         records have been retrieved for the request.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     *
     * @param marker A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the
     *         command. If the <code>Marker</code> field is empty, all response
     *         records have been retrieved for the request.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * A value that indicates the starting point for the next set of response
     * records in a subsequent request. If a value is returned in a response,
     * you can retrieve the next set of records by providing this returned
     * marker value in the <code>Marker</code> parameter and retrying the
     * command. If the <code>Marker</code> field is empty, all response
     * records have been retrieved for the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker A value that indicates the starting point for the next set of response
     *         records in a subsequent request. If a value is returned in a response,
     *         you can retrieve the next set of records by providing this returned
     *         marker value in the <code>Marker</code> parameter and retrying the
     *         command. If the <code>Marker</code> field is empty, all response
     *         records have been retrieved for the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClustersResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * A list of <a>Cluster</a> objects, where each object describes one
     * cluster.
     *
     * @return A list of <a>Cluster</a> objects, where each object describes one
     *         cluster.
     */
    public java.util.List<Cluster> getClusters() {
        if (clusters == null) {
              clusters = new com.amazonaws.internal.ListWithAutoConstructFlag<Cluster>();
              clusters.setAutoConstruct(true);
        }
        return clusters;
    }
    
    /**
     * A list of <a>Cluster</a> objects, where each object describes one
     * cluster.
     *
     * @param clusters A list of <a>Cluster</a> objects, where each object describes one
     *         cluster.
     */
    public void setClusters(java.util.Collection<Cluster> clusters) {
        if (clusters == null) {
            this.clusters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Cluster> clustersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Cluster>(clusters.size());
        clustersCopy.addAll(clusters);
        this.clusters = clustersCopy;
    }
    
    /**
     * A list of <a>Cluster</a> objects, where each object describes one
     * cluster.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setClusters(java.util.Collection)} or {@link
     * #withClusters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusters A list of <a>Cluster</a> objects, where each object describes one
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClustersResult withClusters(Cluster... clusters) {
        if (getClusters() == null) setClusters(new java.util.ArrayList<Cluster>(clusters.length));
        for (Cluster value : clusters) {
            getClusters().add(value);
        }
        return this;
    }
    
    /**
     * A list of <a>Cluster</a> objects, where each object describes one
     * cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusters A list of <a>Cluster</a> objects, where each object describes one
     *         cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeClustersResult withClusters(java.util.Collection<Cluster> clusters) {
        if (clusters == null) {
            this.clusters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Cluster> clustersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Cluster>(clusters.size());
            clustersCopy.addAll(clusters);
            this.clusters = clustersCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getClusters() != null) sb.append("Clusters: " + getClusters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getClusters() == null) ? 0 : getClusters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeClustersResult == false) return false;
        DescribeClustersResult other = (DescribeClustersResult)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getClusters() == null ^ this.getClusters() == null) return false;
        if (other.getClusters() != null && other.getClusters().equals(this.getClusters()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeClustersResult clone() {
        try {
            return (DescribeClustersResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    