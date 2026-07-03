
package com.prowidesoftware.swift.model.mx.dic;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Choice between a single order or a multileg order.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleOrMultiLegOrderChoice", propOrder = {
    "snglOrdrDtls",
    "mltlgOrdrDtls"
})
public class SingleOrMultiLegOrderChoice {

    @XmlElement(name = "SnglOrdrDtls")
    protected SingleOrder1 snglOrdrDtls;
    @XmlElement(name = "MltlgOrdrDtls")
    protected MultiLegOrder1 mltlgOrdrDtls;

    /**
     * Gets the value of the snglOrdrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SingleOrder1 }
     *     
     */
    public SingleOrder1 getSnglOrdrDtls() {
        return snglOrdrDtls;
    }

    /**
     * Sets the value of the snglOrdrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SingleOrder1 }
     *     
     */
    public SingleOrMultiLegOrderChoice setSnglOrdrDtls(SingleOrder1 value) {
        this.snglOrdrDtls = value;
        return this;
    }

    /**
     * Gets the value of the mltlgOrdrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link MultiLegOrder1 }
     *     
     */
    public MultiLegOrder1 getMltlgOrdrDtls() {
        return mltlgOrdrDtls;
    }

    /**
     * Sets the value of the mltlgOrdrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link MultiLegOrder1 }
     *     
     */
    public SingleOrMultiLegOrderChoice setMltlgOrdrDtls(MultiLegOrder1 value) {
        this.mltlgOrdrDtls = value;
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
