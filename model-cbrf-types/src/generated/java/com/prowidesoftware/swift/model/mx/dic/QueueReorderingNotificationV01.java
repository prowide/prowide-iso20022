
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.prowidesoftware.swift.model.mx.adapters.IsoTimeAdapter;
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
 * Notification of queue reordering.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueueReorderingNotificationV01", propOrder = {
    "grpHdr",
    "oprTm",
    "rordrdMsgId",
    "rtrTxCpy",
    "splmtryData"
})
public class QueueReorderingNotificationV01 {

    @XmlElement(name = "GrpHdr", required = true)
    protected GroupHeader58 grpHdr;
    @XmlElement(name = "OprTm", required = true, type = String.class)
    @XmlJavaTypeAdapter(IsoTimeAdapter.class)
    @XmlSchemaType(name = "time")
    protected Calendar oprTm;
    @XmlElement(name = "RordrdMsgId", required = true)
    protected String rordrdMsgId;
    @XmlElement(name = "RtrTxCpy", required = true)
    protected List<ReturnTransactionCopy1> rtrTxCpy;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the grpHdr property.
     * 
     * @return
     *     possible object is
     *     {@link GroupHeader58 }
     *     
     */
    public GroupHeader58 getGrpHdr() {
        return grpHdr;
    }

    /**
     * Sets the value of the grpHdr property.
     * 
     * @param value
     *     allowed object is
     *     {@link GroupHeader58 }
     *     
     */
    public QueueReorderingNotificationV01 setGrpHdr(GroupHeader58 value) {
        this.grpHdr = value;
        return this;
    }

    /**
     * Gets the value of the oprTm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getOprTm() {
        return oprTm;
    }

    /**
     * Sets the value of the oprTm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QueueReorderingNotificationV01 setOprTm(Calendar value) {
        this.oprTm = value;
        return this;
    }

    /**
     * Gets the value of the rordrdMsgId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRordrdMsgId() {
        return rordrdMsgId;
    }

    /**
     * Sets the value of the rordrdMsgId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public QueueReorderingNotificationV01 setRordrdMsgId(String value) {
        this.rordrdMsgId = value;
        return this;
    }

    /**
     * Gets the value of the rtrTxCpy property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the rtrTxCpy property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRtrTxCpy().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ReturnTransactionCopy1 }
     * 
     * 
     * @return
     *     The value of the rtrTxCpy property.
     */
    public List<ReturnTransactionCopy1> getRtrTxCpy() {
        if (rtrTxCpy == null) {
            rtrTxCpy = new ArrayList<>();
        }
        return this.rtrTxCpy;
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
     * Adds a new item to the rtrTxCpy list.
     * @see #getRtrTxCpy()
     * 
     */
    public QueueReorderingNotificationV01 addRtrTxCpy(ReturnTransactionCopy1 rtrTxCpy) {
        getRtrTxCpy().add(rtrTxCpy);
        return this;
    }

    /**
     * Adds a new item to the splmtryData list.
     * @see #getSplmtryData()
     * 
     */
    public QueueReorderingNotificationV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
