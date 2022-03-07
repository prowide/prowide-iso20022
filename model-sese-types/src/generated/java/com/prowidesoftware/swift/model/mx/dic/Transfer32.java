
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transfer32", propOrder = {
    "trfRef",
    "clntRef",
    "ctrPtyRef",
    "bizFlowTp",
    "trfRsn",
    "trfDt",
    "reqdSttlmDt",
    "hldgsPlanTp",
    "finInstrmDtls",
    "ttlUnitsNb",
    "ownAcctTrfInd",
    "nonStdSttlmInf",
    "rcvgAgtDtls",
    "dlvrgAgtDtls"
})
public class Transfer32 {

    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ClntRef")
    protected AdditionalReference7 clntRef;
    @XmlElement(name = "CtrPtyRef")
    protected AdditionalReference7 ctrPtyRef;
    @XmlElement(name = "BizFlowTp")
    @XmlSchemaType(name = "string")
    protected BusinessFlowType1Code bizFlowTp;
    @XmlElement(name = "TrfRsn")
    protected TransferReason1 trfRsn;
    @XmlElement(name = "TrfDt")
    protected DateFormat1Choice trfDt;
    @XmlElement(name = "ReqdSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdSttlmDt;
    @XmlElement(name = "HldgsPlanTp")
    @XmlSchemaType(name = "string")
    protected List<HoldingsPlanType1Code> hldgsPlanTp;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument49 finInstrmDtls;
    @XmlElement(name = "TtlUnitsNb", required = true)
    protected FinancialInstrumentQuantity1 ttlUnitsNb;
    @XmlElement(name = "OwnAcctTrfInd")
    protected Boolean ownAcctTrfInd;
    @XmlElement(name = "NonStdSttlmInf")
    protected String nonStdSttlmInf;
    @XmlElement(name = "RcvgAgtDtls")
    protected PartyIdentificationAndAccount125 rcvgAgtDtls;
    @XmlElement(name = "DlvrgAgtDtls")
    protected PartyIdentificationAndAccount125 dlvrgAgtDtls;

    /**
     * Gets the value of the trfRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfRef() {
        return trfRef;
    }

    /**
     * Sets the value of the trfRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transfer32 setTrfRef(String value) {
        this.trfRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference7 }
     *     
     */
    public AdditionalReference7 getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference7 }
     *     
     */
    public Transfer32 setClntRef(AdditionalReference7 value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference7 }
     *     
     */
    public AdditionalReference7 getCtrPtyRef() {
        return ctrPtyRef;
    }

    /**
     * Sets the value of the ctrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference7 }
     *     
     */
    public Transfer32 setCtrPtyRef(AdditionalReference7 value) {
        this.ctrPtyRef = value;
        return this;
    }

    /**
     * Gets the value of the bizFlowTp property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessFlowType1Code }
     *     
     */
    public BusinessFlowType1Code getBizFlowTp() {
        return bizFlowTp;
    }

    /**
     * Sets the value of the bizFlowTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessFlowType1Code }
     *     
     */
    public Transfer32 setBizFlowTp(BusinessFlowType1Code value) {
        this.bizFlowTp = value;
        return this;
    }

    /**
     * Gets the value of the trfRsn property.
     * 
     * @return
     *     possible object is
     *     {@link TransferReason1 }
     *     
     */
    public TransferReason1 getTrfRsn() {
        return trfRsn;
    }

    /**
     * Sets the value of the trfRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferReason1 }
     *     
     */
    public Transfer32 setTrfRsn(TransferReason1 value) {
        this.trfRsn = value;
        return this;
    }

    /**
     * Gets the value of the trfDt property.
     * 
     * @return
     *     possible object is
     *     {@link DateFormat1Choice }
     *     
     */
    public DateFormat1Choice getTrfDt() {
        return trfDt;
    }

    /**
     * Sets the value of the trfDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateFormat1Choice }
     *     
     */
    public Transfer32 setTrfDt(DateFormat1Choice value) {
        this.trfDt = value;
        return this;
    }

    /**
     * Gets the value of the reqdSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getReqdSttlmDt() {
        return reqdSttlmDt;
    }

    /**
     * Sets the value of the reqdSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transfer32 setReqdSttlmDt(XMLGregorianCalendar value) {
        this.reqdSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the hldgsPlanTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hldgsPlanTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHldgsPlanTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HoldingsPlanType1Code }
     * 
     * 
     */
    public List<HoldingsPlanType1Code> getHldgsPlanTp() {
        if (hldgsPlanTp == null) {
            hldgsPlanTp = new ArrayList<HoldingsPlanType1Code>();
        }
        return this.hldgsPlanTp;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument49 }
     *     
     */
    public FinancialInstrument49 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument49 }
     *     
     */
    public Transfer32 setFinInstrmDtls(FinancialInstrument49 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the ttlUnitsNb property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public FinancialInstrumentQuantity1 getTtlUnitsNb() {
        return ttlUnitsNb;
    }

    /**
     * Sets the value of the ttlUnitsNb property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity1 }
     *     
     */
    public Transfer32 setTtlUnitsNb(FinancialInstrumentQuantity1 value) {
        this.ttlUnitsNb = value;
        return this;
    }

    /**
     * Gets the value of the ownAcctTrfInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOwnAcctTrfInd() {
        return ownAcctTrfInd;
    }

    /**
     * Sets the value of the ownAcctTrfInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public Transfer32 setOwnAcctTrfInd(Boolean value) {
        this.ownAcctTrfInd = value;
        return this;
    }

    /**
     * Gets the value of the nonStdSttlmInf property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNonStdSttlmInf() {
        return nonStdSttlmInf;
    }

    /**
     * Sets the value of the nonStdSttlmInf property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transfer32 setNonStdSttlmInf(String value) {
        this.nonStdSttlmInf = value;
        return this;
    }

    /**
     * Gets the value of the rcvgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount125 }
     *     
     */
    public PartyIdentificationAndAccount125 getRcvgAgtDtls() {
        return rcvgAgtDtls;
    }

    /**
     * Sets the value of the rcvgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount125 }
     *     
     */
    public Transfer32 setRcvgAgtDtls(PartyIdentificationAndAccount125 value) {
        this.rcvgAgtDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount125 }
     *     
     */
    public PartyIdentificationAndAccount125 getDlvrgAgtDtls() {
        return dlvrgAgtDtls;
    }

    /**
     * Sets the value of the dlvrgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount125 }
     *     
     */
    public Transfer32 setDlvrgAgtDtls(PartyIdentificationAndAccount125 value) {
        this.dlvrgAgtDtls = value;
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
     * Adds a new item to the hldgsPlanTp list.
     * @see #getHldgsPlanTp()
     * 
     */
    public Transfer32 addHldgsPlanTp(HoldingsPlanType1Code hldgsPlanTp) {
        getHldgsPlanTp().add(hldgsPlanTp);
        return this;
    }

}
