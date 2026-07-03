
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
 * Communication channel information.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CommunicationChannel1", propOrder = {
    "mtd",
    "dlvrToPtyTp",
    "dlvrToNm",
    "dlvrToAdr"
})
public class CommunicationChannel1 {

    @XmlElement(name = "Mtd", required = true)
    protected String mtd;
    @XmlElement(name = "DlvrToPtyTp", required = true)
    protected PartyType1Choice dlvrToPtyTp;
    @XmlElement(name = "DlvrToNm")
    protected String dlvrToNm;
    @XmlElement(name = "DlvrToAdr")
    protected PostalAddress6 dlvrToAdr;

    /**
     * Gets the value of the mtd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMtd() {
        return mtd;
    }

    /**
     * Sets the value of the mtd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommunicationChannel1 setMtd(String value) {
        this.mtd = value;
        return this;
    }

    /**
     * Gets the value of the dlvrToPtyTp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyType1Choice }
     *     
     */
    public PartyType1Choice getDlvrToPtyTp() {
        return dlvrToPtyTp;
    }

    /**
     * Sets the value of the dlvrToPtyTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyType1Choice }
     *     
     */
    public CommunicationChannel1 setDlvrToPtyTp(PartyType1Choice value) {
        this.dlvrToPtyTp = value;
        return this;
    }

    /**
     * Gets the value of the dlvrToNm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDlvrToNm() {
        return dlvrToNm;
    }

    /**
     * Sets the value of the dlvrToNm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CommunicationChannel1 setDlvrToNm(String value) {
        this.dlvrToNm = value;
        return this;
    }

    /**
     * Gets the value of the dlvrToAdr property.
     * 
     * @return
     *     possible object is
     *     {@link PostalAddress6 }
     *     
     */
    public PostalAddress6 getDlvrToAdr() {
        return dlvrToAdr;
    }

    /**
     * Sets the value of the dlvrToAdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostalAddress6 }
     *     
     */
    public CommunicationChannel1 setDlvrToAdr(PostalAddress6 value) {
        this.dlvrToAdr = value;
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
