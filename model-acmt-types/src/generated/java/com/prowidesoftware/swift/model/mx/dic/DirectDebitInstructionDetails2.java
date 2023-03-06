
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Instructions, initiated by the creditor, to debit a debtor's account in favour of the creditor.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DirectDebitInstructionDetails2", propOrder = {
    "mndtId",
    "automtdDrctDbtInstrInd",
    "drctDbtTrfblInd",
    "cdtr",
    "lastColltnCcyAmt",
    "lastColltnDt",
    "othrDtls"
})
public class DirectDebitInstructionDetails2 {

    @XmlElement(name = "MndtId", required = true)
    protected String mndtId;
    @XmlElement(name = "AutomtdDrctDbtInstrInd")
    protected Boolean automtdDrctDbtInstrInd;
    @XmlElement(name = "DrctDbtTrfblInd")
    protected Boolean drctDbtTrfblInd;
    @XmlElement(name = "Cdtr", required = true)
    protected PartyIdentification135 cdtr;
    @XmlElement(name = "LastColltnCcyAmt")
    protected ActiveOrHistoricCurrencyAndAmount lastColltnCcyAmt;
    @XmlElement(name = "LastColltnDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar lastColltnDt;
    @XmlElement(name = "OthrDtls")
    protected List<TransferInstruction1> othrDtls;

    /**
     * Gets the value of the mndtId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMndtId() {
        return mndtId;
    }

    /**
     * Sets the value of the mndtId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectDebitInstructionDetails2 setMndtId(String value) {
        this.mndtId = value;
        return this;
    }

    /**
     * Gets the value of the automtdDrctDbtInstrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAutomtdDrctDbtInstrInd() {
        return automtdDrctDbtInstrInd;
    }

    /**
     * Sets the value of the automtdDrctDbtInstrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DirectDebitInstructionDetails2 setAutomtdDrctDbtInstrInd(Boolean value) {
        this.automtdDrctDbtInstrInd = value;
        return this;
    }

    /**
     * Gets the value of the drctDbtTrfblInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDrctDbtTrfblInd() {
        return drctDbtTrfblInd;
    }

    /**
     * Sets the value of the drctDbtTrfblInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public DirectDebitInstructionDetails2 setDrctDbtTrfblInd(Boolean value) {
        this.drctDbtTrfblInd = value;
        return this;
    }

    /**
     * Gets the value of the cdtr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getCdtr() {
        return cdtr;
    }

    /**
     * Sets the value of the cdtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public DirectDebitInstructionDetails2 setCdtr(PartyIdentification135 value) {
        this.cdtr = value;
        return this;
    }

    /**
     * Gets the value of the lastColltnCcyAmt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getLastColltnCcyAmt() {
        return lastColltnCcyAmt;
    }

    /**
     * Sets the value of the lastColltnCcyAmt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public DirectDebitInstructionDetails2 setLastColltnCcyAmt(ActiveOrHistoricCurrencyAndAmount value) {
        this.lastColltnCcyAmt = value;
        return this;
    }

    /**
     * Gets the value of the lastColltnDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getLastColltnDt() {
        return lastColltnDt;
    }

    /**
     * Sets the value of the lastColltnDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DirectDebitInstructionDetails2 setLastColltnDt(XMLGregorianCalendar value) {
        this.lastColltnDt = value;
        return this;
    }

    /**
     * Gets the value of the othrDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the othrDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOthrDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TransferInstruction1 }
     * 
     * 
     */
    public List<TransferInstruction1> getOthrDtls() {
        if (othrDtls == null) {
            othrDtls = new ArrayList<TransferInstruction1>();
        }
        return this.othrDtls;
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
     * Adds a new item to the othrDtls list.
     * @see #getOthrDtls()
     * 
     */
    public DirectDebitInstructionDetails2 addOthrDtls(TransferInstruction1 othrDtls) {
        getOthrDtls().add(othrDtls);
        return this;
    }

}
