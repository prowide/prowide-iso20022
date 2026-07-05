
package com.prowidesoftware.swift.model.mx.sys.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Java class for HSMCluster complex type.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HSMCluster", propOrder = {
    "hsmClusterName",
    "hsmBoxList"
})
public class SwHSMCluster {

    @XmlElement(name = "HSMClusterName", required = true)
    protected String hsmClusterName;
    @XmlElement(name = "HSMBoxList", required = true)
    protected SwHSMBoxList hsmBoxList;

    /**
     * Gets the value of the hsmClusterName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHSMClusterName() {
        return hsmClusterName;
    }

    /**
     * Sets the value of the hsmClusterName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SwHSMCluster setHSMClusterName(String value) {
        this.hsmClusterName = value;
        return this;
    }

    /**
     * Gets the value of the hsmBoxList property.
     * 
     * @return
     *     possible object is
     *     {@link SwHSMBoxList }
     *     
     */
    public SwHSMBoxList getHSMBoxList() {
        return hsmBoxList;
    }

    /**
     * Sets the value of the hsmBoxList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SwHSMBoxList }
     *     
     */
    public SwHSMCluster setHSMBoxList(SwHSMBoxList value) {
        this.hsmBoxList = value;
        return this;
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

}
