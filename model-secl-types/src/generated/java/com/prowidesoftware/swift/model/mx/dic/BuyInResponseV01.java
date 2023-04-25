
package com.prowidesoftware.swift.model.mx.dic;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * This message is sent by the clearing member to the central counterparty as a response to the previous buy-in notification message. 
 * 
 * Note: The use of this message in the buy in process is optional and depends on the rules set by each central counterparty.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BuyInResponseV01", propOrder = {
    "id",
    "buyInRspnDtls",
    "orgnlSttlmOblgtnDtls",
    "splmtryData"
})
public class BuyInResponseV01 {

    @XmlElement(name = "Id", required = true)
    protected DocumentIdentification11 id;
    @XmlElement(name = "BuyInRspnDtls")
    protected BuyIn3 buyInRspnDtls;
    @XmlElement(name = "OrgnlSttlmOblgtnDtls", required = true)
    protected SettlementObligation1 orgnlSttlmOblgtnDtls;
    @XmlElement(name = "SplmtryData")
    protected List<SupplementaryData1> splmtryData;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public DocumentIdentification11 getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIdentification11 }
     *     
     */
    public BuyInResponseV01 setId(DocumentIdentification11 value) {
        this.id = value;
        return this;
    }

    /**
     * Gets the value of the buyInRspnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link BuyIn3 }
     *     
     */
    public BuyIn3 getBuyInRspnDtls() {
        return buyInRspnDtls;
    }

    /**
     * Sets the value of the buyInRspnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyIn3 }
     *     
     */
    public BuyInResponseV01 setBuyInRspnDtls(BuyIn3 value) {
        this.buyInRspnDtls = value;
        return this;
    }

    /**
     * Gets the value of the orgnlSttlmOblgtnDtls property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementObligation1 }
     *     
     */
    public SettlementObligation1 getOrgnlSttlmOblgtnDtls() {
        return orgnlSttlmOblgtnDtls;
    }

    /**
     * Sets the value of the orgnlSttlmOblgtnDtls property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementObligation1 }
     *     
     */
    public BuyInResponseV01 setOrgnlSttlmOblgtnDtls(SettlementObligation1 value) {
        this.orgnlSttlmOblgtnDtls = value;
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
    public BuyInResponseV01 addSplmtryData(SupplementaryData1 splmtryData) {
        getSplmtryData().add(splmtryData);
        return this;
    }

}
