
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
import com.prowidesoftware.swift.model.mx.adapters.IsoDateTimeAdapter;
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
@XmlType(name = "MarginReportData8", propOrder = {
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
public class MarginReportData8 {

    @XmlElement(name = "RptgTmStmp", type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rptgTmStmp;
    @XmlElement(name = "CtrPtyId", required = true)
    protected TradeCounterpartyReport20 ctrPtyId;
    @XmlElement(name = "EvtDt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDt;
    @XmlElement(name = "TxId")
    protected UniqueTransactionIdentifier2Choice txId;
    @XmlElement(name = "Coll", required = true)
    protected MarginCollateralReport4 coll;
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
    public XMLGregorianCalendar getRptgTmStmp() {
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
    public MarginReportData8 setRptgTmStmp(XMLGregorianCalendar value) {
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
    public MarginReportData8 setCtrPtyId(TradeCounterpartyReport20 value) {
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
    public XMLGregorianCalendar getEvtDt() {
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
    public MarginReportData8 setEvtDt(XMLGregorianCalendar value) {
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
    public MarginReportData8 setTxId(UniqueTransactionIdentifier2Choice value) {
        this.txId = value;
        return this;
    }

    /**
     * Gets the value of the coll property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCollateralReport4 }
     *     
     */
    public MarginCollateralReport4 getColl() {
        return coll;
    }

    /**
     * Sets the value of the coll property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCollateralReport4 }
     *     
     */
    public MarginReportData8 setColl(MarginCollateralReport4 value) {
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
    public MarginReportData8 setPstdMrgnOrColl(PostedMarginOrCollateral6 value) {
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
    public MarginReportData8 setRcvdMrgnOrColl(ReceivedMarginOrCollateral6 value) {
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
    public MarginReportData8 setCtrPtyRatgTrggrInd(Boolean value) {
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
    public MarginReportData8 setCtrPtyRatgThrshldInd(Boolean value) {
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
    public MarginReportData8 setCtrctMod(ContractModification8 value) {
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
    public MarginReportData8 setTechAttrbts(TechnicalAttributes6 value) {
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
    public MarginReportData8 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
