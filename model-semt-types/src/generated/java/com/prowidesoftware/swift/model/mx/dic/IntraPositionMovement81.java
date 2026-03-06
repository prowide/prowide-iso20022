
package com.prowidesoftware.swift.model.mx.dic;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
 * Identifies additional details of the transaction.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IntraPositionMovement8__1", propOrder = {
    "balFr",
    "balTo",
    "finInstrmId",
    "sttlmQty",
    "sttldQty",
    "prevslySttldQty",
    "rmngToBeSttldQty",
    "intnddSttlmDt",
    "fctvSttlmDt",
    "stsDt",
    "ackdStsTmStmp",
    "lnkgs",
    "sctiesSubBalId",
    "prty",
    "msgOrgtr",
    "creDtTm"
})
public class IntraPositionMovement81 {

    @XmlElement(name = "BalFr", required = true)
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt029Draft balFr;
    @XmlElement(name = "BalTo", required = true)
    protected SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt029Draft balTo;
    @XmlElement(name = "FinInstrmId", required = true)
    protected SecurityIdentification191 finInstrmId;
    @XmlElement(name = "SttlmQty", required = true)
    protected FinancialInstrumentQuantity1Choice1 sttlmQty;
    @XmlElement(name = "SttldQty")
    protected FinancialInstrumentQuantity1Choice1 sttldQty;
    @XmlElement(name = "PrevslySttldQty")
    protected FinancialInstrumentQuantity1Choice1 prevslySttldQty;
    @XmlElement(name = "RmngToBeSttldQty")
    protected FinancialInstrumentQuantity1Choice1 rmngToBeSttldQty;
    @XmlElement(name = "IntnddSttlmDt", required = true)
    protected DateAndDateTime2Choice1Draft intnddSttlmDt;
    @XmlElement(name = "FctvSttlmDt")
    protected DateAndDateTime2Choice1Draft fctvSttlmDt;
    @XmlElement(name = "StsDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime stsDt;
    @XmlElement(name = "AckdStsTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime ackdStsTmStmp;
    @XmlElement(name = "Lnkgs")
    protected List<Linkages571Draft> lnkgs;
    @XmlElement(name = "SctiesSubBalId")
    protected GenericIdentification371 sctiesSubBalId;
    @XmlElement(name = "Prty")
    protected PriorityNumeric4Choice1 prty;
    @XmlElement(name = "MsgOrgtr")
    protected SystemPartyIdentification81 msgOrgtr;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime creDtTm;

    /**
     * Gets the value of the balFr property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt029Draft }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt029Draft getBalFr() {
        return balFr;
    }

    /**
     * Sets the value of the balFr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt029Draft }
     *     
     */
    public IntraPositionMovement81 setBalFr(SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt029Draft value) {
        this.balFr = value;
        return this;
    }

    /**
     * Gets the value of the balTo property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt029Draft }
     *     
     */
    public SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt029Draft getBalTo() {
        return balTo;
    }

    /**
     * Sets the value of the balTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt029Draft }
     *     
     */
    public IntraPositionMovement81 setBalTo(SecuritiesSubBalanceTypeAndQuantityBreakdown31Semt029Draft value) {
        this.balTo = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmId property.
     * 
     * @return
     *     possible object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public SecurityIdentification191 getFinInstrmId() {
        return finInstrmId;
    }

    /**
     * Sets the value of the finInstrmId property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecurityIdentification191 }
     *     
     */
    public IntraPositionMovement81 setFinInstrmId(SecurityIdentification191 value) {
        this.finInstrmId = value;
        return this;
    }

    /**
     * Gets the value of the sttlmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public FinancialInstrumentQuantity1Choice1 getSttlmQty() {
        return sttlmQty;
    }

    /**
     * Sets the value of the sttlmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public IntraPositionMovement81 setSttlmQty(FinancialInstrumentQuantity1Choice1 value) {
        this.sttlmQty = value;
        return this;
    }

    /**
     * Gets the value of the sttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public FinancialInstrumentQuantity1Choice1 getSttldQty() {
        return sttldQty;
    }

    /**
     * Sets the value of the sttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public IntraPositionMovement81 setSttldQty(FinancialInstrumentQuantity1Choice1 value) {
        this.sttldQty = value;
        return this;
    }

    /**
     * Gets the value of the prevslySttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public FinancialInstrumentQuantity1Choice1 getPrevslySttldQty() {
        return prevslySttldQty;
    }

    /**
     * Sets the value of the prevslySttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public IntraPositionMovement81 setPrevslySttldQty(FinancialInstrumentQuantity1Choice1 value) {
        this.prevslySttldQty = value;
        return this;
    }

    /**
     * Gets the value of the rmngToBeSttldQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public FinancialInstrumentQuantity1Choice1 getRmngToBeSttldQty() {
        return rmngToBeSttldQty;
    }

    /**
     * Sets the value of the rmngToBeSttldQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1Choice1 }
     *     
     */
    public IntraPositionMovement81 setRmngToBeSttldQty(FinancialInstrumentQuantity1Choice1 value) {
        this.rmngToBeSttldQty = value;
        return this;
    }

    /**
     * Gets the value of the intnddSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice1Draft }
     *     
     */
    public DateAndDateTime2Choice1Draft getIntnddSttlmDt() {
        return intnddSttlmDt;
    }

    /**
     * Sets the value of the intnddSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice1Draft }
     *     
     */
    public IntraPositionMovement81 setIntnddSttlmDt(DateAndDateTime2Choice1Draft value) {
        this.intnddSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the fctvSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateAndDateTime2Choice1Draft }
     *     
     */
    public DateAndDateTime2Choice1Draft getFctvSttlmDt() {
        return fctvSttlmDt;
    }

    /**
     * Sets the value of the fctvSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAndDateTime2Choice1Draft }
     *     
     */
    public IntraPositionMovement81 setFctvSttlmDt(DateAndDateTime2Choice1Draft value) {
        this.fctvSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the stsDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getStsDt() {
        return stsDt;
    }

    /**
     * Sets the value of the stsDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IntraPositionMovement81 setStsDt(OffsetDateTime value) {
        this.stsDt = value;
        return this;
    }

    /**
     * Gets the value of the ackdStsTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getAckdStsTmStmp() {
        return ackdStsTmStmp;
    }

    /**
     * Sets the value of the ackdStsTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IntraPositionMovement81 setAckdStsTmStmp(OffsetDateTime value) {
        this.ackdStsTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the lnkgs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the lnkgs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLnkgs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Linkages571Draft }
     * 
     * 
     * @return
     *     The value of the lnkgs property.
     */
    public List<Linkages571Draft> getLnkgs() {
        if (lnkgs == null) {
            lnkgs = new ArrayList<>();
        }
        return this.lnkgs;
    }

    /**
     * Gets the value of the sctiesSubBalId property.
     * 
     * @return
     *     possible object is
     *     {@link GenericIdentification371 }
     *     
     */
    public GenericIdentification371 getSctiesSubBalId() {
        return sctiesSubBalId;
    }

    /**
     * Sets the value of the sctiesSubBalId property.
     * 
     * @param value
     *     allowed object is
     *     {@link GenericIdentification371 }
     *     
     */
    public IntraPositionMovement81 setSctiesSubBalId(GenericIdentification371 value) {
        this.sctiesSubBalId = value;
        return this;
    }

    /**
     * Gets the value of the prty property.
     * 
     * @return
     *     possible object is
     *     {@link PriorityNumeric4Choice1 }
     *     
     */
    public PriorityNumeric4Choice1 getPrty() {
        return prty;
    }

    /**
     * Sets the value of the prty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriorityNumeric4Choice1 }
     *     
     */
    public IntraPositionMovement81 setPrty(PriorityNumeric4Choice1 value) {
        this.prty = value;
        return this;
    }

    /**
     * Gets the value of the msgOrgtr property.
     * 
     * @return
     *     possible object is
     *     {@link SystemPartyIdentification81 }
     *     
     */
    public SystemPartyIdentification81 getMsgOrgtr() {
        return msgOrgtr;
    }

    /**
     * Sets the value of the msgOrgtr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SystemPartyIdentification81 }
     *     
     */
    public IntraPositionMovement81 setMsgOrgtr(SystemPartyIdentification81 value) {
        this.msgOrgtr = value;
        return this;
    }

    /**
     * Gets the value of the creDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getCreDtTm() {
        return creDtTm;
    }

    /**
     * Sets the value of the creDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public IntraPositionMovement81 setCreDtTm(OffsetDateTime value) {
        this.creDtTm = value;
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

    /**
     * Adds a new item to the lnkgs list.
     * @see #getLnkgs()
     * 
     */
    public IntraPositionMovement81 addLnkgs(Linkages571Draft lnkgs) {
        getLnkgs().add(lnkgs);
        return this;
    }

}
