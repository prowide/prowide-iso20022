
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Characteristics of a cheque instruction, such as cheque type or cheque number.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Cheque13", propOrder = {
    "instrId",
    "chqNb",
    "isseDt",
    "stlDt",
    "amt",
    "valDt",
    "pyer",
    "pyerAcct",
    "drwrAgt",
    "drwrAgtAcct",
    "pyee",
    "pyeeAcct",
    "instrForChqAgt"
})
public class Cheque13 {

    @XmlElement(name = "InstrId")
    protected String instrId;
    @XmlElement(name = "ChqNb", required = true)
    protected String chqNb;
    @XmlElement(name = "IsseDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar isseDt;
    @XmlElement(name = "StlDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar stlDt;
    @XmlElement(name = "Amt", required = true)
    protected ActiveCurrencyAndAmount amt;
    @XmlElement(name = "ValDt")
    protected DateAndDateTime2Choice valDt;
    @XmlElement(name = "Pyer")
    protected PartyIdentification135 pyer;
    @XmlElement(name = "PyerAcct")
    protected CashAccount40 pyerAcct;
    @XmlElement(name = "DrwrAgt")
    protected BranchAndFinancialInstitutionIdentification6 drwrAgt;
    @XmlElement(name = "DrwrAgtAcct")
    protected CashAccount40 drwrAgtAcct;
    @XmlElement(name = "Pyee", required = true)
    protected PartyIdentification135 pyee;
    @XmlElement(name = "PyeeAcct")
    protected CashAccount40 pyeeAcct;
    @XmlElement(name = "InstrForChqAgt")
    protected List<InstructionForChequeAgent1> instrForChqAgt;

    /**
     * Gets the value of the instrId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstrId() {
        return instrId;
    }

    /**
     * Sets the value of the instrId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque13 setInstrId(String value) {
        this.instrId = value;
        return this;
    }

    /**
     * Gets the value of the chqNb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChqNb() {
        return chqNb;
    }

    /**
     * Sets the value of the chqNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque13 setChqNb(String value) {
        this.chqNb = value;
        return this;
    }

    /**
     * Gets the value of the isseDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getIsseDt() {
        return isseDt;
    }

    /**
     * Sets the value of the isseDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque13 setIsseDt(Calendar value) {
        this.isseDt = value;
        return this;
    }

    /**
     * Gets the value of the stlDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getStlDt() {
        return stlDt;
    }

    /**
     * Sets the value of the stlDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Cheque13 setStlDt(Calendar value) {
        this.stlDt = value;
        return this;
    }

    /**
     * Gets the value of the amt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public ActiveCurrencyAndAmount getAmt() {
        return amt;
    }

    /**
     * Sets the value of the amt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveCurrencyAndAmount }
     *     
     */
    public Cheque13 setAmt(ActiveCurrencyAndAmount value) {
        this.amt = value;
        return this;
    }

    /**
     * Gets the value of the valDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public DateAndDateTime2Choice getValDt() {
        return valDt;
    }

    /**
     * Sets the value of the valDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice }
     *     
     */
    public Cheque13 setValDt(DateAndDateTime2Choice value) {
        this.valDt = value;
        return this;
    }

    /**
     * Gets the value of the pyer property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getPyer() {
        return pyer;
    }

    /**
     * Sets the value of the pyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public Cheque13 setPyer(PartyIdentification135 value) {
        this.pyer = value;
        return this;
    }

    /**
     * Gets the value of the pyerAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPyerAcct() {
        return pyerAcct;
    }

    /**
     * Sets the value of the pyerAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public Cheque13 setPyerAcct(CashAccount40 value) {
        this.pyerAcct = value;
        return this;
    }

    /**
     * Gets the value of the drwrAgt property.
     * 
     * @return
     *     possible object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public BranchAndFinancialInstitutionIdentification6 getDrwrAgt() {
        return drwrAgt;
    }

    /**
     * Sets the value of the drwrAgt property.
     * 
     * @param value
     *     allowed object is
     *     {@link BranchAndFinancialInstitutionIdentification6 }
     *     
     */
    public Cheque13 setDrwrAgt(BranchAndFinancialInstitutionIdentification6 value) {
        this.drwrAgt = value;
        return this;
    }

    /**
     * Gets the value of the drwrAgtAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getDrwrAgtAcct() {
        return drwrAgtAcct;
    }

    /**
     * Sets the value of the drwrAgtAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public Cheque13 setDrwrAgtAcct(CashAccount40 value) {
        this.drwrAgtAcct = value;
        return this;
    }

    /**
     * Gets the value of the pyee property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification135 }
     *     
     */
    public PartyIdentification135 getPyee() {
        return pyee;
    }

    /**
     * Sets the value of the pyee property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification135 }
     *     
     */
    public Cheque13 setPyee(PartyIdentification135 value) {
        this.pyee = value;
        return this;
    }

    /**
     * Gets the value of the pyeeAcct property.
     * 
     * @return
     *     possible object is
     *     {@link CashAccount40 }
     *     
     */
    public CashAccount40 getPyeeAcct() {
        return pyeeAcct;
    }

    /**
     * Sets the value of the pyeeAcct property.
     * 
     * @param value
     *     allowed object is
     *     {@link CashAccount40 }
     *     
     */
    public Cheque13 setPyeeAcct(CashAccount40 value) {
        this.pyeeAcct = value;
        return this;
    }

    /**
     * Gets the value of the instrForChqAgt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrForChqAgt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrForChqAgt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstructionForChequeAgent1 }
     * 
     * 
     * @return
     *     The value of the instrForChqAgt property.
     */
    public List<InstructionForChequeAgent1> getInstrForChqAgt() {
        if (instrForChqAgt == null) {
            instrForChqAgt = new ArrayList<>();
        }
        return this.instrForChqAgt;
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
     * Adds a new item to the instrForChqAgt list.
     * @see #getInstrForChqAgt()
     * 
     */
    public Cheque13 addInstrForChqAgt(InstructionForChequeAgent1 instrForChqAgt) {
        getInstrForChqAgt().add(instrForChqAgt);
        return this;
    }

}
