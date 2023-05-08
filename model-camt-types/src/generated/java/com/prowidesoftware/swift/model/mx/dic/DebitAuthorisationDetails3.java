
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
 * Provides the reason for requesting a debit authorisation as well as the amount of the requested debit.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DebitAuthorisationDetails3", propOrder = {
    "cxlRsn",
    "amtToDbt",
    "valDtToDbt",
    "addtlCxlRsnInf"
})
public class DebitAuthorisationDetails3 {

    @XmlElement(name = "CxlRsn", required = true)
    protected CancellationReason2Choice cxlRsn;
    @XmlElement(name = "AmtToDbt")
    protected ActiveOrHistoricCurrencyAndAmount amtToDbt;
    @XmlElement(name = "ValDtToDbt", type = String.class)
    @XmlJavaTypeAdapter(IsoDateAdapter.class)
    @XmlSchemaType(name = "date")
    protected Calendar valDtToDbt;
    @XmlElement(name = "AddtlCxlRsnInf")
    protected List<String> addtlCxlRsnInf;

    /**
     * Gets the value of the cxlRsn property.
     * 
     * @return
     *     possible object is
     *     {@link CancellationReason2Choice }
     *     
     */
    public CancellationReason2Choice getCxlRsn() {
        return cxlRsn;
    }

    /**
     * Sets the value of the cxlRsn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationReason2Choice }
     *     
     */
    public DebitAuthorisationDetails3 setCxlRsn(CancellationReason2Choice value) {
        this.cxlRsn = value;
        return this;
    }

    /**
     * Gets the value of the amtToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public ActiveOrHistoricCurrencyAndAmount getAmtToDbt() {
        return amtToDbt;
    }

    /**
     * Sets the value of the amtToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link ActiveOrHistoricCurrencyAndAmount }
     *     
     */
    public DebitAuthorisationDetails3 setAmtToDbt(ActiveOrHistoricCurrencyAndAmount value) {
        this.amtToDbt = value;
        return this;
    }

    /**
     * Gets the value of the valDtToDbt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getValDtToDbt() {
        return valDtToDbt;
    }

    /**
     * Sets the value of the valDtToDbt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public DebitAuthorisationDetails3 setValDtToDbt(Calendar value) {
        this.valDtToDbt = value;
        return this;
    }

    /**
     * Gets the value of the addtlCxlRsnInf property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the addtlCxlRsnInf property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAddtlCxlRsnInf().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     * @return
     *     The value of the addtlCxlRsnInf property.
     */
    public List<String> getAddtlCxlRsnInf() {
        if (addtlCxlRsnInf == null) {
            addtlCxlRsnInf = new ArrayList<>();
        }
        return this.addtlCxlRsnInf;
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
     * Adds a new item to the addtlCxlRsnInf list.
     * @see #getAddtlCxlRsnInf()
     * 
     */
    public DebitAuthorisationDetails3 addAddtlCxlRsnInf(String addtlCxlRsnInf) {
        getAddtlCxlRsnInf().add(addtlCxlRsnInf);
        return this;
    }

}
