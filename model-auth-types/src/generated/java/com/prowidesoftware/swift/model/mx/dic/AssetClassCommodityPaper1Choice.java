
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
 * Defines commodity attributes of a derivative where the type is paper.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssetClassCommodityPaper1Choice", propOrder = {
    "cntnrBrd",
    "nwsprnt",
    "pulp",
    "rcvrdPpr"
})
public class AssetClassCommodityPaper1Choice {

    @XmlElement(name = "CntnrBrd")
    protected PaperCommodityContainerBoard1 cntnrBrd;
    @XmlElement(name = "Nwsprnt")
    protected PaperCommodityNewsprint1 nwsprnt;
    @XmlElement(name = "Pulp")
    protected PaperCommodityPulp1 pulp;
    @XmlElement(name = "RcvrdPpr")
    protected PaperCommodityRecoveredPaper1 rcvrdPpr;

    /**
     * Gets the value of the cntnrBrd property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityContainerBoard1 }
     *     
     */
    public PaperCommodityContainerBoard1 getCntnrBrd() {
        return cntnrBrd;
    }

    /**
     * Sets the value of the cntnrBrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityContainerBoard1 }
     *     
     */
    public AssetClassCommodityPaper1Choice setCntnrBrd(PaperCommodityContainerBoard1 value) {
        this.cntnrBrd = value;
        return this;
    }

    /**
     * Gets the value of the nwsprnt property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityNewsprint1 }
     *     
     */
    public PaperCommodityNewsprint1 getNwsprnt() {
        return nwsprnt;
    }

    /**
     * Sets the value of the nwsprnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityNewsprint1 }
     *     
     */
    public AssetClassCommodityPaper1Choice setNwsprnt(PaperCommodityNewsprint1 value) {
        this.nwsprnt = value;
        return this;
    }

    /**
     * Gets the value of the pulp property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityPulp1 }
     *     
     */
    public PaperCommodityPulp1 getPulp() {
        return pulp;
    }

    /**
     * Sets the value of the pulp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityPulp1 }
     *     
     */
    public AssetClassCommodityPaper1Choice setPulp(PaperCommodityPulp1 value) {
        this.pulp = value;
        return this;
    }

    /**
     * Gets the value of the rcvrdPpr property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityRecoveredPaper1 }
     *     
     */
    public PaperCommodityRecoveredPaper1 getRcvrdPpr() {
        return rcvrdPpr;
    }

    /**
     * Sets the value of the rcvrdPpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityRecoveredPaper1 }
     *     
     */
    public AssetClassCommodityPaper1Choice setRcvrdPpr(PaperCommodityRecoveredPaper1 value) {
        this.rcvrdPpr = value;
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
