
package com.prowidesoftware.swift.model.mx.sys.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for HSMClusterList complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMClusterList", propOrder = {
    "hsmCluster"
})
public class SwHSMClusterList {

    @XmlElement(name = "HSMCluster", required = true)
    protected List<SwHSMCluster> hsmCluster;

    /**
     * Gets the value of the hsmCluster property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hsmCluster property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHSMCluster().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SwHSMCluster }
     * 
     * 
     */
    public List<SwHSMCluster> getHSMCluster() {
        if (hsmCluster == null) {
            hsmCluster = new ArrayList<SwHSMCluster>();
        }
        return this.hsmCluster;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

    @Override
    public boolean equals(Object that) {
        return EqualsBuilder.reflectionEquals(this, that);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    /**
     * Adds a new item to the hSMCluster list.
     * @see #getHSMCluster()
     * 
     */
    public SwHSMClusterList addHSMCluster(SwHSMCluster hSMCluster) {
        getHSMCluster().add(hSMCluster);
        return this;
    }

}
