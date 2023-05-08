
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
 * Parameters applied to the settlement of a security transfer.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transfer27", propOrder = {
    "trfRef",
    "clntRef",
    "ctrPtyRef",
    "bizFlowTp",
    "reqdSttlmDt",
    "trfOrdrDtForm",
    "trfRsn",
    "hldgsPlanTp",
    "finInstrmDtls",
    "qty",
    "unitsDtls",
    "rndg",
    "avrgPric",
    "trfCcy",
    "ownAcctTrfInd",
    "nonStdSttlmInf",
    "rcvgAgtDtls",
    "dlvrgAgtDtls",
    "trfExpnssPmtTp"
})
public class Transfer27 {

    @XmlElement(name = "TrfRef", required = true)
    protected String trfRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "CtrPtyRef")
    protected AdditionalReference2 ctrPtyRef;
    @XmlElement(name = "BizFlowTp")
    @XmlSchemaType(name = "string")
    protected BusinessFlowType1Code bizFlowTp;
    @XmlElement(name = "ReqdSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar reqdSttlmDt;
    @XmlElement(name = "TrfOrdrDtForm", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar trfOrdrDtForm;
    @XmlElement(name = "TrfRsn")
    protected TransferReason1 trfRsn;
    @XmlElement(name = "HldgsPlanTp")
    @XmlSchemaType(name = "string")
    protected List<HoldingsPlanType1Code> hldgsPlanTp;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument13 finInstrmDtls;
    @XmlElement(name = "Qty", required = true)
    protected Quantity13Choice qty;
    @XmlElement(name = "UnitsDtls")
    protected List<Unit3> unitsDtls;
    @XmlElement(name = "Rndg")
    @XmlSchemaType(name = "string")
    protected RoundingDirection2Code rndg;
    @XmlElement(name = "AvrgPric")
    protected ActiveOrHistoricCurrencyAnd13DecimalAmount avrgPric;
    @XmlElement(name = "TrfCcy")
    protected String trfCcy;
    @XmlElement(name = "OwnAcctTrfInd")
    protected Boolean ownAcctTrfInd;
    @XmlElement(name = "NonStdSttlmInf")
    protected String nonStdSttlmInf;
    @XmlElement(name = "RcvgAgtDtls")
    protected PartyIdentificationAndAccount93 rcvgAgtDtls;
    @XmlElement(name = "DlvrgAgtDtls")
    protected PartyIdentificationAndAccount93 dlvrgAgtDtls;
    @XmlElement(name = "TrfExpnssPmtTp")
    protected ChargePaymentMethod1Choice trfExpnssPmtTp;

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
    public Transfer27 setTrfRef(String value) {
        this.trfRef = value;
        return this;
    }

    /**
     * Gets the value of the clntRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClntRef() {
        return clntRef;
    }

    /**
     * Sets the value of the clntRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transfer27 setClntRef(String value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRef property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalReference2 }
     *     
     */
    public AdditionalReference2 getCtrPtyRef() {
        return ctrPtyRef;
    }

    /**
     * Sets the value of the ctrPtyRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalReference2 }
     *     
     */
    public Transfer27 setCtrPtyRef(AdditionalReference2 value) {
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
    public Transfer27 setBizFlowTp(BusinessFlowType1Code value) {
        this.bizFlowTp = value;
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
    public Calendar getReqdSttlmDt() {
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
    public Transfer27 setReqdSttlmDt(Calendar value) {
        this.reqdSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the trfOrdrDtForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getTrfOrdrDtForm() {
        return trfOrdrDtForm;
    }

    /**
     * Sets the value of the trfOrdrDtForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transfer27 setTrfOrdrDtForm(Calendar value) {
        this.trfOrdrDtForm = value;
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
    public Transfer27 setTrfRsn(TransferReason1 value) {
        this.trfRsn = value;
        return this;
    }

    /**
     * Gets the value of the hldgsPlanTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the hldgsPlanTp property.
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
     * @return
     *     The value of the hldgsPlanTp property.
     */
    public List<HoldingsPlanType1Code> getHldgsPlanTp() {
        if (hldgsPlanTp == null) {
            hldgsPlanTp = new ArrayList<>();
        }
        return this.hldgsPlanTp;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument13 }
     *     
     */
    public FinancialInstrument13 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument13 }
     *     
     */
    public Transfer27 setFinInstrmDtls(FinancialInstrument13 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the qty property.
     * 
     * @return
     *     possible object is
     *     {@link Quantity13Choice }
     *     
     */
    public Quantity13Choice getQty() {
        return qty;
    }

    /**
     * Sets the value of the qty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Quantity13Choice }
     *     
     */
    public Transfer27 setQty(Quantity13Choice value) {
        this.qty = value;
        return this;
    }

    /**
     * Gets the value of the unitsDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the unitsDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUnitsDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Unit3 }
     * 
     * 
     * @return
     *     The value of the unitsDtls property.
     */
    public List<Unit3> getUnitsDtls() {
        if (unitsDtls == null) {
            unitsDtls = new ArrayList<>();
        }
        return this.unitsDtls;
    }

    /**
     * Gets the value of the rndg property.
     * 
     * @return
     *     possible object is
     *     {@link RoundingDirection2Code }
     *     
     */
    public RoundingDirection2Code getRndg() {
        return rndg;
    }

    /**
     * Sets the value of the rndg property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoundingDirection2Code }
     *     
     */
    public Transfer27 setRndg(RoundingDirection2Code value) {
        this.rndg = value;
        return this;
    }

    /**
     * Gets the value of the avrgPric property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAnd13DecimalAmount getAvrgPric() {
        return avrgPric;
    }

    /**
     * Sets the value of the avrgPric property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAnd13DecimalAmount }
     *     
     */
    public Transfer27 setAvrgPric(ActiveOrHistoricCurrencyAnd13DecimalAmount value) {
        this.avrgPric = value;
        return this;
    }

    /**
     * Gets the value of the trfCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTrfCcy() {
        return trfCcy;
    }

    /**
     * Sets the value of the trfCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public Transfer27 setTrfCcy(String value) {
        this.trfCcy = value;
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
    public Transfer27 setOwnAcctTrfInd(Boolean value) {
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
    public Transfer27 setNonStdSttlmInf(String value) {
        this.nonStdSttlmInf = value;
        return this;
    }

    /**
     * Gets the value of the rcvgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount93 }
     *     
     */
    public PartyIdentificationAndAccount93 getRcvgAgtDtls() {
        return rcvgAgtDtls;
    }

    /**
     * Sets the value of the rcvgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount93 }
     *     
     */
    public Transfer27 setRcvgAgtDtls(PartyIdentificationAndAccount93 value) {
        this.rcvgAgtDtls = value;
        return this;
    }

    /**
     * Gets the value of the dlvrgAgtDtls property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentificationAndAccount93 }
     *     
     */
    public PartyIdentificationAndAccount93 getDlvrgAgtDtls() {
        return dlvrgAgtDtls;
    }

    /**
     * Sets the value of the dlvrgAgtDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentificationAndAccount93 }
     *     
     */
    public Transfer27 setDlvrgAgtDtls(PartyIdentificationAndAccount93 value) {
        this.dlvrgAgtDtls = value;
        return this;
    }

    /**
     * Gets the value of the trfExpnssPmtTp property.
     * 
     * @return
     *     possible object is
     *     {@link ChargePaymentMethod1Choice }
     *     
     */
    public ChargePaymentMethod1Choice getTrfExpnssPmtTp() {
        return trfExpnssPmtTp;
    }

    /**
     * Sets the value of the trfExpnssPmtTp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ChargePaymentMethod1Choice }
     *     
     */
    public Transfer27 setTrfExpnssPmtTp(ChargePaymentMethod1Choice value) {
        this.trfExpnssPmtTp = value;
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
    public Transfer27 addHldgsPlanTp(HoldingsPlanType1Code hldgsPlanTp) {
        getHldgsPlanTp().add(hldgsPlanTp);
        return this;
    }

    /**
     * Adds a new item to the unitsDtls list.
     * @see #getUnitsDtls()
     * 
     */
    public Transfer27 addUnitsDtls(Unit3 unitsDtls) {
        getUnitsDtls().add(unitsDtls);
        return this;
    }

}
