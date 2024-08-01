
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
@XmlType(name = "AssetClassCommodityPaper4Choice", propOrder = {
    "cntnrBrd",
    "nwsprnt",
    "pulp",
    "rcvrdPpr",
    "othr"
})
public class AssetClassCommodityPaper4Choice {

    @XmlElement(name = "CntnrBrd")
    protected PaperCommodityContainerBoard2 cntnrBrd;
    @XmlElement(name = "Nwsprnt")
    protected PaperCommodityNewsprint2 nwsprnt;
    @XmlElement(name = "Pulp")
    protected PaperCommodityPulp2 pulp;
    @XmlElement(name = "RcvrdPpr")
    protected PaperCommodityOther1 rcvrdPpr;
    @XmlElement(name = "Othr")
    protected PaperCommodityOther1 othr;

    /**
     * Gets the value of the cntnrBrd property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityContainerBoard2 }
     *     
     */
    public PaperCommodityContainerBoard2 getCntnrBrd() {
        return cntnrBrd;
    }

    /**
     * Sets the value of the cntnrBrd property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityContainerBoard2 }
     *     
     */
    public AssetClassCommodityPaper4Choice setCntnrBrd(PaperCommodityContainerBoard2 value) {
        this.cntnrBrd = value;
        return this;
    }

    /**
     * Gets the value of the nwsprnt property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityNewsprint2 }
     *     
     */
    public PaperCommodityNewsprint2 getNwsprnt() {
        return nwsprnt;
    }

    /**
     * Sets the value of the nwsprnt property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityNewsprint2 }
     *     
     */
    public AssetClassCommodityPaper4Choice setNwsprnt(PaperCommodityNewsprint2 value) {
        this.nwsprnt = value;
        return this;
    }

    /**
     * Gets the value of the pulp property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityPulp2 }
     *     
     */
    public PaperCommodityPulp2 getPulp() {
        return pulp;
    }

    /**
     * Sets the value of the pulp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityPulp2 }
     *     
     */
    public AssetClassCommodityPaper4Choice setPulp(PaperCommodityPulp2 value) {
        this.pulp = value;
        return this;
    }

    /**
     * Gets the value of the rcvrdPpr property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityOther1 }
     *     
     */
    public PaperCommodityOther1 getRcvrdPpr() {
        return rcvrdPpr;
    }

    /**
     * Sets the value of the rcvrdPpr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityOther1 }
     *     
     */
    public AssetClassCommodityPaper4Choice setRcvrdPpr(PaperCommodityOther1 value) {
        this.rcvrdPpr = value;
        return this;
    }

    /**
     * Gets the value of the othr property.
     * 
     * @return
     *     possible object is
     *     {@link PaperCommodityOther1 }
     *     
     */
    public PaperCommodityOther1 getOthr() {
        return othr;
    }

    /**
     * Sets the value of the othr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaperCommodityOther1 }
     *     
     */
    public AssetClassCommodityPaper4Choice setOthr(PaperCommodityOther1 value) {
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
