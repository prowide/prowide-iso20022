
package com.prowidesoftware.swift.model.mx.dic;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
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
@XmlType(name = "AssetClassCommodityPaper3Choice", propOrder = {
    "cntnrBrd",
    "nwsprnt",
    "pulp",
    "rcvrdPpr",
    "othr"
})
public class AssetClassCommodityPaper3Choice {

    @XmlElement(name = "CntnrBrd")
    protected PaperCommodityContainerBoard1 cntnrBrd;
    @XmlElement(name = "Nwsprnt")
    protected PaperCommodityNewsprint1 nwsprnt;
    @XmlElement(name = "Pulp")
    protected PaperCommodityPulp1 pulp;
    @XmlElement(name = "RcvrdPpr")
    protected PaperCommodityRecoveredPaper1 rcvrdPpr;
    @XmlElement(name = "Othr")
    protected PaperCommodityRecoveredPaper2 othr;

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
    public AssetClassCommodityPaper3Choice setCntnrBrd(PaperCommodityContainerBoard1 value) {
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
    public AssetClassCommodityPaper3Choice setNwsprnt(PaperCommodityNewsprint1 value) {
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
    public AssetClassCommodityPaper3Choice setPulp(PaperCommodityPulp1 value) {
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
    public AssetClassCommodityPaper3Choice setRcvrdPpr(PaperCommodityRecoveredPaper1 value) {
        this.rcvrdPpr = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityRecoveredPaper2 }
     *     
     */
    public PaperCommodityRecoveredPaper2 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityRecoveredPaper2 }
     *     
     */
    public AssetClassCommodityPaper3Choice setOthr(PaperCommodityRecoveredPaper2 value) {
        this.othr = value;
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
