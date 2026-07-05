
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
 * Choice between types of reporting parameter.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportParameter2Choice", propOrder = {
    "pty",
    "ctry",
    "ccy",
    "usrDfnd"
})
public class ReportParameter2Choice {

    @XmlElement(name = "Pty")
    protected PartyIdentification2Choice pty;
    @XmlElement(name = "Ctry")
    protected String ctry;
    @XmlElement(name = "Ccy")
    protected String ccy;
    @XmlElement(name = "UsrDfnd")
    protected DataFormat2Choice usrDfnd;

    /**
     * Gets the value of the pty property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public PartyIdentification2Choice getPty() {
        return pty;
    }

    /**
     * Sets the value of the pty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification2Choice }
     *     
     */
    public ReportParameter2Choice setPty(PartyIdentification2Choice value) {
        this.pty = value;
        return this;
    }

    /**
     * Gets the value of the ctry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCtry() {
        return ctry;
    }

    /**
     * Sets the value of the ctry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportParameter2Choice setCtry(String value) {
        this.ctry = value;
        return this;
    }

    /**
     * Gets the value of the ccy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCcy() {
        return ccy;
    }

    /**
     * Sets the value of the ccy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public ReportParameter2Choice setCcy(String value) {
        this.ccy = value;
        return this;
    }

    /**
     * Gets the value of the usrDfnd property.
     * 
     * @return
     *     possible object is
     *     {@link DataFormat2Choice }
     *     
     */
    public DataFormat2Choice getUsrDfnd() {
        return usrDfnd;
    }

    /**
     * Sets the value of the usrDfnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataFormat2Choice }
     *     
     */
    public ReportParameter2Choice setUsrDfnd(DataFormat2Choice value) {
        this.usrDfnd = value;
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
