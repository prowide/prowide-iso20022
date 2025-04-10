
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
 * Scope
 * This message is sent by the CBR payment system to its participant detailing their balance, limits, and restrictions.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LiquidityReportV01", propOrder = {
    "msgHdr",
    "creRsn",
    "creDtTm",
    "acctLqdtyRpt",
    "splmtryData"
})
public class LiquidityReportV01 {

    @XmlElement(name = "MsgHdr", required = true)
    protected MessageHeader3 msgHdr;
    @XmlElement(name = "CreRsn", required = true)
    protected String creRsn;
    @XmlElement(name = "CreDtTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoDateTimeAdapter.class)
    @XmlSchemaType(name = "dateTime")
    protected OffsetDateTime creDtTm;
    @XmlElement(name = "AcctLqdtyRpt", required = true)
    protected List<AccountLiquidityReport1> acctLqdtyRpt;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the msgHdr property.
     * 
     * @return
     *     possible object is
     *     {@link MessageHeader3 }
     *     
     */
    public MessageHeader3 getMsgHdr() {
        return msgHdr;
    }

    /**
     * Sets the value of the msgHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageHeader3 }
     *     
     */
    public LiquidityReportV01 setMsgHdr(MessageHeader3 value) {
        this.msgHdr = value;
        return this;
    }

    /**
     * Gets the value of the creRsn property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreRsn() {
        return creRsn;
    }

    /**
     * Sets the value of the creRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public LiquidityReportV01 setCreRsn(String value) {
        this.creRsn = value;
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
    public LiquidityReportV01 setCreDtTm(OffsetDateTime value) {
        this.creDtTm = value;
        return this;
    }

    /**
     * Gets the value of the acctLqdtyRpt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the acctLqdtyRpt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAcctLqdtyRpt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccountLiquidityReport1 }
     * 
     * 
     * @return
     *     The value of the acctLqdtyRpt property.
     */
    public List<AccountLiquidityReport1> getAcctLqdtyRpt() {
        if (acctLqdtyRpt == null) {
            acctLqdtyRpt = new ArrayList<>();
        }
        return this.acctLqdtyRpt;
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
     * Adds a new item to the acctLqdtyRpt list.
     * @see #getAcctLqdtyRpt()
     * 
     */
    public LiquidityReportV01 addAcctLqdtyRpt(AccountLiquidityReport1 acctLqdtyRpt) {
        getAcctLqdtyRpt().add(acctLqdtyRpt);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public LiquidityReportV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
