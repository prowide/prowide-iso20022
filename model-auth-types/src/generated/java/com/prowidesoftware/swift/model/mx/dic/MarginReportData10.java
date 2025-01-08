
package com.prowidesoftware.swift.model.mx.dic;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoDateAdapter;
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
 * Specifies the details of the margin data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarginReportData10", propOrder = {
    "rptgTmStmp",
    "ctrPtyId",
    "evtDt",
    "txId",
    "coll",
    "pstdMrgnOrColl",
    "rcvdMrgnOrColl",
    "ctrPtyRatgTrggrInd",
    "ctrPtyRatgThrshldInd",
    "ctrctMod",
    "techAttrbts",
    "splmtryData"
})
public class MarginReportData10 {

    @XmlElement(name = "RptgTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime rptgTmStmp;
    @XmlElement(name = "CtrPtyId", required = true)
    protected TradeCounterpartyReport20 ctrPtyId;
    @XmlElement(name = "EvtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected LocalDate evtDt;
    @XmlElement(name = "TxId")
    protected UniqueTransactionIdentifier2Choice txId;
    @XmlElement(name = "Coll", required = true)
    protected MarginCollateralReport5 coll;
    @XmlElement(name = "PstdMrgnOrColl")
    protected PostedMarginOrCollateral6 pstdMrgnOrColl;
    @XmlElement(name = "RcvdMrgnOrColl")
    protected ReceivedMarginOrCollateral6 rcvdMrgnOrColl;
    @XmlElement(name = "CtrPtyRatgTrggrInd")
    protected Boolean ctrPtyRatgTrggrInd;
    @XmlElement(name = "CtrPtyRatgThrshldInd")
    protected Boolean ctrPtyRatgThrshldInd;
    @XmlElement(name = "CtrctMod")
    protected ContractModification8 ctrctMod;
    @XmlElement(name = "TechAttrbts")
    protected TechnicalAttributes6 techAttrbts;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the rptgTmStmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public OffsetDateTime getRptgTmStmp() {
        return rptgTmStmp;
    }

    /**
     * Sets the value of the rptgTmStmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarginReportData10 setRptgTmStmp(OffsetDateTime value) {
        this.rptgTmStmp = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyId property.
     * 
     * @return
     *     possible object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public TradeCounterpartyReport20 getCtrPtyId() {
        return ctrPtyId;
    }

    /**
     * Sets the value of the ctrPtyId property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeCounterpartyReport20 }
     *     
     */
    public MarginReportData10 setCtrPtyId(TradeCounterpartyReport20 value) {
        this.ctrPtyId = value;
        return this;
    }

    /**
     * Gets the value of the evtDt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public LocalDate getEvtDt() {
        return evtDt;
    }

    /**
     * Sets the value of the evtDt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public MarginReportData10 setEvtDt(LocalDate value) {
        this.evtDt = value;
        return this;
    }

    /**
     * Gets the value of the txId property.
     * 
     * @return
     *     possible object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public UniqueTransactionIdentifier2Choice getTxId() {
        return txId;
    }

    /**
     * Sets the value of the txId property.
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueTransactionIdentifier2Choice }
     *     
     */
    public MarginReportData10 setTxId(UniqueTransactionIdentifier2Choice value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCollateralReport5 }
     *     
     */
    public MarginCollateralReport5 getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCollateralReport5 }
     *     
     */
    public MarginReportData10 setColl(MarginCollateralReport5 value) {
        this.coll = value;
        return this;
    }

    /**
     * Gets the value of the pstdMrgnOrColl property.
     * 
     * @return
     *     possible object is
     *     {@link PostedMarginOrCollateral6 }
     *     
     */
    public PostedMarginOrCollateral6 getPstdMrgnOrColl() {
        return pstdMrgnOrColl;
    }

    /**
     * Sets the value of the pstdMrgnOrColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostedMarginOrCollateral6 }
     *     
     */
    public MarginReportData10 setPstdMrgnOrColl(PostedMarginOrCollateral6 value) {
        this.pstdMrgnOrColl = value;
        return this;
    }

    /**
     * Gets the value of the rcvdMrgnOrColl property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedMarginOrCollateral6 }
     *     
     */
    public ReceivedMarginOrCollateral6 getRcvdMrgnOrColl() {
        return rcvdMrgnOrColl;
    }

    /**
     * Sets the value of the rcvdMrgnOrColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedMarginOrCollateral6 }
     *     
     */
    public MarginReportData10 setRcvdMrgnOrColl(ReceivedMarginOrCollateral6 value) {
        this.rcvdMrgnOrColl = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRatgTrggrInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtrPtyRatgTrggrInd() {
        return ctrPtyRatgTrggrInd;
    }

    /**
     * Sets the value of the ctrPtyRatgTrggrInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MarginReportData10 setCtrPtyRatgTrggrInd(Boolean value) {
        this.ctrPtyRatgTrggrInd = value;
        return this;
    }

    /**
     * Gets the value of the ctrPtyRatgThrshldInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCtrPtyRatgThrshldInd() {
        return ctrPtyRatgThrshldInd;
    }

    /**
     * Sets the value of the ctrPtyRatgThrshldInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public MarginReportData10 setCtrPtyRatgThrshldInd(Boolean value) {
        this.ctrPtyRatgThrshldInd = value;
        return this;
    }

    /**
     * Gets the value of the ctrctMod property.
     * 
     * @return
     *     possible object is
     *     {@link ContractModification8 }
     *     
     */
    public ContractModification8 getCtrctMod() {
        return ctrctMod;
    }

    /**
     * Sets the value of the ctrctMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractModification8 }
     *     
     */
    public MarginReportData10 setCtrctMod(ContractModification8 value) {
        this.ctrctMod = value;
        return this;
    }

    /**
     * Gets the value of the techAttrbts property.
     * 
     * @return
     *     possible object is
     *     {@link TechnicalAttributes6 }
     *     
     */
    public TechnicalAttributes6 getTechAttrbts() {
        return techAttrbts;
    }

    /**
     * Sets the value of the techAttrbts property.
     * 
     * @param value
     *     allowed object is
     *     {@link TechnicalAttributes6 }
     *     
     */
    public MarginReportData10 setTechAttrbts(TechnicalAttributes6 value) {
        this.techAttrbts = value;
        return this;
    }

    /**
     * Gets the value of the splmtryData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the splmtryData property.
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
     * @return
     *     The value of the splmtryData property.
     */
    public List<SupplementaryData1> getSplmtryData() {
        if (splmtryData == null) {
            splmtryData = new ArrayList<>();
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
    public MarginReportData10 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
