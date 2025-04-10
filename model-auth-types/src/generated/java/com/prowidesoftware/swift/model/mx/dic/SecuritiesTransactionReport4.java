
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Details of the securities transaction report.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecuritiesTransactionReport4", propOrder = {
    "txId",
    "exctgPty",
    "invstmtPtyInd",
    "submitgPty",
    "buyr",
    "sellr",
    "ordrTrnsmssn",
    "tx",
    "finInstrm",
    "invstmtDcsnPrsn",
    "exctgPrsn",
    "addtlAttrbts",
    "techAttrbts",
    "splmtryData"
})
public class SecuritiesTransactionReport4 {

    @XmlElement(name = "TxId", required = true)
    protected String txId;
    @XmlElement(name = "ExctgPty", required = true)
    protected String exctgPty;
    @XmlElement(name = "InvstmtPtyInd")
    protected boolean invstmtPtyInd;
    @XmlElement(name = "SubmitgPty", required = true)
    protected String submitgPty;
    @XmlElement(name = "Buyr", required = true)
    protected PartyIdentification79 buyr;
    @XmlElement(name = "Sellr", required = true)
    protected PartyIdentification79 sellr;
    @XmlElement(name = "OrdrTrnsmssn", required = true)
    protected SecuritiesTransactionTransmission2 ordrTrnsmssn;
    @XmlElement(name = "Tx", required = true)
    protected SecuritiesTransaction1 tx;
    @XmlElement(name = "FinInstrm", required = true)
    protected FinancialInstrumentAttributes3Choice finInstrm;
    @XmlElement(name = "InvstmtDcsnPrsn")
    protected InvestmentParty1Choice invstmtDcsnPrsn;
    @XmlElement(name = "ExctgPrsn", required = true)
    protected ExecutingParty1Choice exctgPrsn;
    @XmlElement(name = "AddtlAttrbts", required = true)
    protected SecuritiesTransactionIndicator2 addtlAttrbts;
    @XmlElement(name = "TechAttrbts")
    protected RecordTechnicalData1 techAttrbts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTransactionReport4 setTxId(String value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the exctgPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExctgPty() {
        return exctgPty;
    }

    /**
     * Sets the value of the exctgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTransactionReport4 setExctgPty(String value) {
        this.exctgPty = value;
        return this;
    }

    /**
     * Gets the value of the invstmtPtyInd property.
     * 
     */
    public boolean isInvstmtPtyInd() {
        return invstmtPtyInd;
    }

    /**
     * Sets the value of the invstmtPtyInd property.
     * 
     */
    public SecuritiesTransactionReport4 setInvstmtPtyInd(boolean value) {
        this.invstmtPtyInd = value;
        return this;
    }

    /**
     * Gets the value of the submitgPty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubmitgPty() {
        return submitgPty;
    }

    /**
     * Sets the value of the submitgPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public SecuritiesTransactionReport4 setSubmitgPty(String value) {
        this.submitgPty = value;
        return this;
    }

    /**
     * Gets the value of the buyr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification79 }
     *     
     */
    public PartyIdentification79 getBuyr() {
        return buyr;
    }

    /**
     * Sets the value of the buyr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification79 }
     *     
     */
    public SecuritiesTransactionReport4 setBuyr(PartyIdentification79 value) {
        this.buyr = value;
        return this;
    }

    /**
     * Gets the value of the sellr property.
     * 
     * @return
     *     possible object is
     *     {@link PartyIdentification79 }
     *     
     */
    public PartyIdentification79 getSellr() {
        return sellr;
    }

    /**
     * Sets the value of the sellr property.
     * 
     * @param value
     *     allowed object is
     *     {@link PartyIdentification79 }
     *     
     */
    public SecuritiesTransactionReport4 setSellr(PartyIdentification79 value) {
        this.sellr = value;
        return this;
    }

    /**
     * Gets the value of the ordrTrnsmssn property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionTransmission2 }
     *     
     */
    public SecuritiesTransactionTransmission2 getOrdrTrnsmssn() {
        return ordrTrnsmssn;
    }

    /**
     * Sets the value of the ordrTrnsmssn property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionTransmission2 }
     *     
     */
    public SecuritiesTransactionReport4 setOrdrTrnsmssn(SecuritiesTransactionTransmission2 value) {
        this.ordrTrnsmssn = value;
        return this;
    }

    /**
     * Gets the value of the tx property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransaction1 }
     *     
     */
    public SecuritiesTransaction1 getTx() {
        return tx;
    }

    /**
     * Sets the value of the tx property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransaction1 }
     *     
     */
    public SecuritiesTransactionReport4 setTx(SecuritiesTransaction1 value) {
        this.tx = value;
        return this;
    }

    /**
     * Gets the value of the finInstrm property.
     * 
     * @return
     *     possible object is
     *     {@link FinancialInstrumentAttributes3Choice }
     *     
     */
    public FinancialInstrumentAttributes3Choice getFinInstrm() {
        return finInstrm;
    }

    /**
     * Sets the value of the finInstrm property.
     * 
     * @param value
     *     allowed object is
     *     {@link FinancialInstrumentAttributes3Choice }
     *     
     */
    public SecuritiesTransactionReport4 setFinInstrm(FinancialInstrumentAttributes3Choice value) {
        this.finInstrm = value;
        return this;
    }

    /**
     * Gets the value of the invstmtDcsnPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link InvestmentParty1Choice }
     *     
     */
    public InvestmentParty1Choice getInvstmtDcsnPrsn() {
        return invstmtDcsnPrsn;
    }

    /**
     * Sets the value of the invstmtDcsnPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvestmentParty1Choice }
     *     
     */
    public SecuritiesTransactionReport4 setInvstmtDcsnPrsn(InvestmentParty1Choice value) {
        this.invstmtDcsnPrsn = value;
        return this;
    }

    /**
     * Gets the value of the exctgPrsn property.
     * 
     * @return
     *     possible object is
     *     {@link ExecutingParty1Choice }
     *     
     */
    public ExecutingParty1Choice getExctgPrsn() {
        return exctgPrsn;
    }

    /**
     * Sets the value of the exctgPrsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExecutingParty1Choice }
     *     
     */
    public SecuritiesTransactionReport4 setExctgPrsn(ExecutingParty1Choice value) {
        this.exctgPrsn = value;
        return this;
    }

    /**
     * Gets the value of the addtlAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link SecuritiesTransactionIndicator2 }
     *     
     */
    public SecuritiesTransactionIndicator2 getAddtlAttrbts() {
        return addtlAttrbts;
    }

    /**
     * Sets the value of the addtlAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link SecuritiesTransactionIndicator2 }
     *     
     */
    public SecuritiesTransactionReport4 setAddtlAttrbts(SecuritiesTransactionIndicator2 value) {
        this.addtlAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the techAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTechnicalData1 }
     *     
     */
    public RecordTechnicalData1 getTechAttrbts() {
        return techAttrbts;
    }

    /**
     * Sets the value of the techAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTechnicalData1 }
     *     
     */
    public SecuritiesTransactionReport4 setTechAttrbts(RecordTechnicalData1 value) {
        this.techAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the splmtryData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSplmtryData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SupplementaryData1 }
     * 
     * 
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<SupplementaryData1>();
        }
        return this.splmtryData;
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
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public SecuritiesTransactionReport4 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
