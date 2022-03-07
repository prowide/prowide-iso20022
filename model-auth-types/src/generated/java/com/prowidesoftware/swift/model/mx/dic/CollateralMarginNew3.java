
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
 * Specifies details of the collateral margin data.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CollateralMarginNew3", propOrder = {
    "techRcrdId",
    "rptgDtTm",
    "evtDt",
    "ctrPty",
    "collPrtflId",
    "pstdMrgnOrColl",
    "rcvdMrgnOrColl",
    "rcncltnFlg",
    "ctrctMod",
    "splmtryData"
})
public class CollateralMarginNew3 {

    @XmlElement(name = "TechRcrdId")
    protected String techRcrdId;
    @XmlElement(name = "RptgDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar rptgDtTm;
    @XmlElement(name = "EvtDt", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar evtDt;
    @XmlElement(name = "CtrPty", required = true)
    protected Counterparty30 ctrPty;
    @XmlElement(name = "CollPrtflId", required = true)
    protected String collPrtflId;
    @XmlElement(name = "PstdMrgnOrColl")
    protected PostedMarginOrCollateral1 pstdMrgnOrColl;
    @XmlElement(name = "RcvdMrgnOrColl")
    protected ReceivedMarginOrCollateral1 rcvdMrgnOrColl;
    @XmlElement(name = "RcncltnFlg")
    protected ReconciliationFlag1 rcncltnFlg;
    @XmlElement(name = "CtrctMod", required = true)
    protected ContractModification1 ctrctMod;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the techRcrdId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTechRcrdId() {
        return techRcrdId;
    }

    /**
     * Sets the value of the techRcrdId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralMarginNew3 setTechRcrdId(String value) {
        this.techRcrdId = value;
        return this;
    }

    /**
     * Gets the value of the rptgDtTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public XMLGregorianCalendar getRptgDtTm() {
        return rptgDtTm;
    }

    /**
     * Sets the value of the rptgDtTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralMarginNew3 setRptgDtTm(XMLGregorianCalendar value) {
        this.rptgDtTm = value;
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
    public CollateralMarginNew3 setEvtDt(XMLGregorianCalendar value) {
        this.evtDt = value;
        return this;
    }

    /**
     * Gets the value of the ctrPty property.
     * 
     * @return
     *     possible object is
     *     {@link Counterparty30 }
     *     
     */
    public Counterparty30 getCtrPty() {
        return ctrPty;
    }

    /**
     * Sets the value of the ctrPty property.
     * 
     * @param value
     *     allowed object is
     *     {@link Counterparty30 }
     *     
     */
    public CollateralMarginNew3 setCtrPty(Counterparty30 value) {
        this.ctrPty = value;
        return this;
    }

    /**
     * Gets the value of the collPrtflId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCollPrtflId() {
        return collPrtflId;
    }

    /**
     * Sets the value of the collPrtflId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public CollateralMarginNew3 setCollPrtflId(String value) {
        this.collPrtflId = value;
        return this;
    }

    /**
     * Gets the value of the pstdMrgnOrColl property.
     * 
     * @return
     *     possible object is
     *     {@link PostedMarginOrCollateral1 }
     *     
     */
    public PostedMarginOrCollateral1 getPstdMrgnOrColl() {
        return pstdMrgnOrColl;
    }

    /**
     * Sets the value of the pstdMrgnOrColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link PostedMarginOrCollateral1 }
     *     
     */
    public CollateralMarginNew3 setPstdMrgnOrColl(PostedMarginOrCollateral1 value) {
        this.pstdMrgnOrColl = value;
        return this;
    }

    /**
     * Gets the value of the rcvdMrgnOrColl property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedMarginOrCollateral1 }
     *     
     */
    public ReceivedMarginOrCollateral1 getRcvdMrgnOrColl() {
        return rcvdMrgnOrColl;
    }

    /**
     * Sets the value of the rcvdMrgnOrColl property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedMarginOrCollateral1 }
     *     
     */
    public CollateralMarginNew3 setRcvdMrgnOrColl(ReceivedMarginOrCollateral1 value) {
        this.rcvdMrgnOrColl = value;
        return this;
    }

    /**
     * Gets the value of the rcncltnFlg property.
     * 
     * @return
     *     possible object is
     *     {@link ReconciliationFlag1 }
     *     
     */
    public ReconciliationFlag1 getRcncltnFlg() {
        return rcncltnFlg;
    }

    /**
     * Sets the value of the rcncltnFlg property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReconciliationFlag1 }
     *     
     */
    public CollateralMarginNew3 setRcncltnFlg(ReconciliationFlag1 value) {
        this.rcncltnFlg = value;
        return this;
    }

    /**
     * Gets the value of the ctrctMod property.
     * 
     * @return
     *     possible object is
     *     {@link ContractModification1 }
     *     
     */
    public ContractModification1 getCtrctMod() {
        return ctrctMod;
    }

    /**
     * Sets the value of the ctrctMod property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContractModification1 }
     *     
     */
    public CollateralMarginNew3 setCtrctMod(ContractModification1 value) {
        this.ctrctMod = value;
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
    public CollateralMarginNew3 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
