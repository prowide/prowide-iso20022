
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
 * Information related to counterparty identification.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Counterparty46", propOrder = {
    "idTp",
    "ntr",
    "rptgOblgtn"
})
public class Counterparty46 {

    @XmlElement(name = "IdTp")
    protected PartyIdentification248Choice idTp;
    @XmlElement(name = "Ntr")
    protected CounterpartyTradeNature15Choice ntr;
    @XmlElement(name = "RptgOblgtn")
    protected Boolean rptgOblgtn;

    /**
     * Gets the value of the idTp property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public PartyIdentification248Choice getIdTp() {
        return idTp;
    }

    /**
     * Sets the value of the idTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification248Choice }
     *     
     */
    public Counterparty46 setIdTp(PartyIdentification248Choice value) {
        this.idTp = value;
        return this;
    }

    /**
     * Gets the value of the ntr property.
     * 
     * @return
     *     possible object is
     *     {@link CounterpartyTradeNature15Choice }
     *     
     */
    public CounterpartyTradeNature15Choice getNtr() {
        return ntr;
    }

    /**
     * Sets the value of the ntr property.
     * 
     * @param value
     *     allowed object is
     *     {@link CounterpartyTradeNature15Choice }
     *     
     */
    public Counterparty46 setNtr(CounterpartyTradeNature15Choice value) {
        this.ntr = value;
        return this;
    }

    /**
     * Gets the value of the rptgOblgtn property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRptgOblgtn() {
        return rptgOblgtn;
    }

    /**
     * Sets the value of the rptgOblgtn property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Counterparty46 setRptgOblgtn(Boolean value) {
        this.rptgOblgtn = value;
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
