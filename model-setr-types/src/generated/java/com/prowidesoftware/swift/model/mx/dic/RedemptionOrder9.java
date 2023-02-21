
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
 * Instruction from an investor to sell investment fund units back to the fund.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedemptionOrder9", propOrder = {
    "mstrRef",
    "ordrRef",
    "clntRef",
    "reqdTradDt",
    "hdgFndOrdrTp",
    "invstmtAcctDtls",
    "bnfcryDtls",
    "finInstrmDtls",
    "finInstrmQty",
    "sdPcktDtls",
    "lotDtls",
    "ordrWvrDtls",
    "chrgDtls",
    "taxDtls",
    "cshSttlmDt",
    "reqdSttlmCcy",
    "pmtRef",
    "rltdPtyDtls"
})
public class RedemptionOrder9 {

    @XmlElement(name = "MstrRef")
    protected String mstrRef;
    @XmlElement(name = "OrdrRef", required = true)
    protected String ordrRef;
    @XmlElement(name = "ClntRef")
    protected String clntRef;
    @XmlElement(name = "ReqdTradDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar reqdTradDt;
    @XmlElement(name = "HdgFndOrdrTp")
    @XmlSchemaType(name = "string")
    protected List<HedgeFundOrderType1Code> hdgFndOrdrTp;
    @XmlElement(name = "InvstmtAcctDtls", required = true)
    protected InvestmentAccount30 invstmtAcctDtls;
    @XmlElement(name = "BnfcryDtls")
    protected IndividualPerson15 bnfcryDtls;
    @XmlElement(name = "FinInstrmDtls", required = true)
    protected FinancialInstrument18 finInstrmDtls;
    @XmlElement(name = "FinInstrmQty", required = true)
    protected FinancialInstrumentQuantity10Choice finInstrmQty;
    @XmlElement(name = "SdPcktDtls")
    protected SidePocketInformation1 sdPcktDtls;
    @XmlElement(name = "LotDtls")
    protected List<LotDetails1> lotDtls;
    @XmlElement(name = "OrdrWvrDtls")
    protected AdditionalInformation2 ordrWvrDtls;
    @XmlElement(name = "ChrgDtls")
    protected List<Charge21> chrgDtls;
    @XmlElement(name = "TaxDtls")
    protected List<Tax19> taxDtls;
    @XmlElement(name = "CshSttlmDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar cshSttlmDt;
    @XmlElement(name = "ReqdSttlmCcy")
    protected String reqdSttlmCcy;
    @XmlElement(name = "PmtRef")
    protected String pmtRef;
    @XmlElement(name = "RltdPtyDtls")
    protected List<Intermediary16> rltdPtyDtls;

    /**
     * Gets the value of the mstrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMstrRef() {
        return mstrRef;
    }

    /**
     * Sets the value of the mstrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionOrder9 setMstrRef(String value) {
        this.mstrRef = value;
        return this;
    }

    /**
     * Gets the value of the ordrRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrdrRef() {
        return ordrRef;
    }

    /**
     * Sets the value of the ordrRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionOrder9 setOrdrRef(String value) {
        this.ordrRef = value;
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
    public RedemptionOrder9 setClntRef(String value) {
        this.clntRef = value;
        return this;
    }

    /**
     * Gets the value of the reqdTradDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getReqdTradDt() {
        return reqdTradDt;
    }

    /**
     * Sets the value of the reqdTradDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionOrder9 setReqdTradDt(XMLGregorianCalendar value) {
        this.reqdTradDt = value;
        return this;
    }

    /**
     * Gets the value of the hdgFndOrdrTp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hdgFndOrdrTp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHdgFndOrdrTp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HedgeFundOrderType1Code }
     * 
     * 
     */
    public List<HedgeFundOrderType1Code> getHdgFndOrdrTp() {
        if (hdgFndOrdrTp == null) {
            hdgFndOrdrTp = new ArrayList<HedgeFundOrderType1Code>();
        }
        return this.hdgFndOrdrTp;
    }

    /**
     * Gets the value of the invstmtAcctDtls property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentAccount30 }
     *     
     */
    public InvestmentAccount30 getInvstmtAcctDtls() {
        return invstmtAcctDtls;
    }

    /**
     * Sets the value of the invstmtAcctDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentAccount30 }
     *     
     */
    public RedemptionOrder9 setInvstmtAcctDtls(InvestmentAccount30 value) {
        this.invstmtAcctDtls = value;
        return this;
    }

    /**
     * Gets the value of the bnfcryDtls property.
     * 
     * @return
     *     possible object is
     *     {@link IndividualPerson15 }
     *     
     */
    public IndividualPerson15 getBnfcryDtls() {
        return bnfcryDtls;
    }

    /**
     * Sets the value of the bnfcryDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link IndividualPerson15 }
     *     
     */
    public RedemptionOrder9 setBnfcryDtls(IndividualPerson15 value) {
        this.bnfcryDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrument18 }
     *     
     */
    public FinancialInstrument18 getFinInstrmDtls() {
        return finInstrmDtls;
    }

    /**
     * Sets the value of the finInstrmDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrument18 }
     *     
     */
    public RedemptionOrder9 setFinInstrmDtls(FinancialInstrument18 value) {
        this.finInstrmDtls = value;
        return this;
    }

    /**
     * Gets the value of the finInstrmQty property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentQuantity10Choice }
     *     
     */
    public FinancialInstrumentQuantity10Choice getFinInstrmQty() {
        return finInstrmQty;
    }

    /**
     * Sets the value of the finInstrmQty property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentQuantity10Choice }
     *     
     */
    public RedemptionOrder9 setFinInstrmQty(FinancialInstrumentQuantity10Choice value) {
        this.finInstrmQty = value;
        return this;
    }

    /**
     * Gets the value of the sdPcktDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SidePocketInformation1 }
     *     
     */
    public SidePocketInformation1 getSdPcktDtls() {
        return sdPcktDtls;
    }

    /**
     * Sets the value of the sdPcktDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SidePocketInformation1 }
     *     
     */
    public RedemptionOrder9 setSdPcktDtls(SidePocketInformation1 value) {
        this.sdPcktDtls = value;
        return this;
    }

    /**
     * Gets the value of the lotDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotDetails1 }
     * 
     * 
     */
    public List<LotDetails1> getLotDtls() {
        if (lotDtls == null) {
            lotDtls = new ArrayList<LotDetails1>();
        }
        return this.lotDtls;
    }

    /**
     * Gets the value of the ordrWvrDtls property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalInformation2 }
     *     
     */
    public AdditionalInformation2 getOrdrWvrDtls() {
        return ordrWvrDtls;
    }

    /**
     * Sets the value of the ordrWvrDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalInformation2 }
     *     
     */
    public RedemptionOrder9 setOrdrWvrDtls(AdditionalInformation2 value) {
        this.ordrWvrDtls = value;
        return this;
    }

    /**
     * Gets the value of the chrgDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the chrgDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChrgDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Charge21 }
     * 
     * 
     */
    public List<Charge21> getChrgDtls() {
        if (chrgDtls == null) {
            chrgDtls = new ArrayList<Charge21>();
        }
        return this.chrgDtls;
    }

    /**
     * Gets the value of the taxDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Tax19 }
     * 
     * 
     */
    public List<Tax19> getTaxDtls() {
        if (taxDtls == null) {
            taxDtls = new ArrayList<Tax19>();
        }
        return this.taxDtls;
    }

    /**
     * Gets the value of the cshSttlmDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getCshSttlmDt() {
        return cshSttlmDt;
    }

    /**
     * Sets the value of the cshSttlmDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionOrder9 setCshSttlmDt(XMLGregorianCalendar value) {
        this.cshSttlmDt = value;
        return this;
    }

    /**
     * Gets the value of the reqdSttlmCcy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReqdSttlmCcy() {
        return reqdSttlmCcy;
    }

    /**
     * Sets the value of the reqdSttlmCcy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionOrder9 setReqdSttlmCcy(String value) {
        this.reqdSttlmCcy = value;
        return this;
    }

    /**
     * Gets the value of the pmtRef property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPmtRef() {
        return pmtRef;
    }

    /**
     * Sets the value of the pmtRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public RedemptionOrder9 setPmtRef(String value) {
        this.pmtRef = value;
        return this;
    }

    /**
     * Gets the value of the rltdPtyDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rltdPtyDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRltdPtyDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Intermediary16 }
     * 
     * 
     */
    public List<Intermediary16> getRltdPtyDtls() {
        if (rltdPtyDtls == null) {
            rltdPtyDtls = new ArrayList<Intermediary16>();
        }
        return this.rltdPtyDtls;
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
     * Adds a new item to the hdgFndOrdrTp list.
     * @see #getHdgFndOrdrTp()
     * 
     */
    public RedemptionOrder9 addHdgFndOrdrTp(HedgeFundOrderType1Code hdgFndOrdrTp) {
        getHdgFndOrdrTp().add(hdgFndOrdrTp);
        return this;
    }

    /**
     * Adds a new item to the lotDtls list.
     * @see #getLotDtls()
     * 
     */
    public RedemptionOrder9 addLotDtls(LotDetails1 lotDtls) {
        getLotDtls().add(lotDtls);
        return this;
    }

    /**
     * Adds a new item to the chrgDtls list.
     * @see #getChrgDtls()
     * 
     */
    public RedemptionOrder9 addChrgDtls(Charge21 chrgDtls) {
        getChrgDtls().add(chrgDtls);
        return this;
    }

    /**
     * Adds a new item to the taxDtls list.
     * @see #getTaxDtls()
     * 
     */
    public RedemptionOrder9 addTaxDtls(Tax19 taxDtls) {
        getTaxDtls().add(taxDtls);
        return this;
    }

    /**
     * Adds a new item to the rltdPtyDtls list.
     * @see #getRltdPtyDtls()
     * 
     */
    public RedemptionOrder9 addRltdPtyDtls(Intermediary16 rltdPtyDtls) {
        getRltdPtyDtls().add(rltdPtyDtls);
        return this;
    }

}
