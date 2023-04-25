
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
 * Choice between the type of quote to be cancelled. Not required when cancelling all quotes.
 * 
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuoteCancellation1Choice", propOrder = {
    "finInstrmDtls",
    "finInstrmAttrbts",
    "stiptns",
    "undrlygFinInstrmDtls",
    "undrlygFinInstrmAttrbts",
    "undrlygStiptns",
    "instrmLegGrpDtls"
})
public class QuoteCancellation1Choice {

    @XmlElement(name = "FinInstrmDtls")
    protected List<SecurityIdentification7> finInstrmDtls;
    @XmlElement(name = "FinInstrmAttrbts")
    protected List<FinancialInstrumentAttributes1> finInstrmAttrbts;
    @XmlElement(name = "Stiptns")
    protected List<FinancialInstrumentStipulations> stiptns;
    @XmlElement(name = "UndrlygFinInstrmDtls")
    protected List<SecurityIdentification7> undrlygFinInstrmDtls;
    @XmlElement(name = "UndrlygFinInstrmAttrbts")
    protected List<FinancialInstrumentAttributes1> undrlygFinInstrmAttrbts;
    @XmlElement(name = "UndrlygStiptns")
    protected List<FinancialInstrumentStipulations> undrlygStiptns;
    @XmlElement(name = "InstrmLegGrpDtls")
    protected List<InstrumentLeg2> instrmLegGrpDtls;

    /**
     * Gets the value of the finInstrmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification7 }
     * 
     * 
     * @return
     *     The value of the finInstrmDtls property.
     */
    public List<SecurityIdentification7> getFinInstrmDtls() {
        if (finInstrmDtls == null) {
            finInstrmDtls = new ArrayList<>();
        }
        return this.finInstrmDtls;
    }

    /**
     * Gets the value of the finInstrmAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the finInstrmAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFinInstrmAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAttributes1 }
     * 
     * 
     * @return
     *     The value of the finInstrmAttrbts property.
     */
    public List<FinancialInstrumentAttributes1> getFinInstrmAttrbts() {
        if (finInstrmAttrbts == null) {
            finInstrmAttrbts = new ArrayList<>();
        }
        return this.finInstrmAttrbts;
    }

    /**
     * Gets the value of the stiptns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the stiptns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStiptns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentStipulations }
     * 
     * 
     * @return
     *     The value of the stiptns property.
     */
    public List<FinancialInstrumentStipulations> getStiptns() {
        if (stiptns == null) {
            stiptns = new ArrayList<>();
        }
        return this.stiptns;
    }

    /**
     * Gets the value of the undrlygFinInstrmDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygFinInstrmDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrmDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SecurityIdentification7 }
     * 
     * 
     * @return
     *     The value of the undrlygFinInstrmDtls property.
     */
    public List<SecurityIdentification7> getUndrlygFinInstrmDtls() {
        if (undrlygFinInstrmDtls == null) {
            undrlygFinInstrmDtls = new ArrayList<>();
        }
        return this.undrlygFinInstrmDtls;
    }

    /**
     * Gets the value of the undrlygFinInstrmAttrbts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygFinInstrmAttrbts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygFinInstrmAttrbts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentAttributes1 }
     * 
     * 
     * @return
     *     The value of the undrlygFinInstrmAttrbts property.
     */
    public List<FinancialInstrumentAttributes1> getUndrlygFinInstrmAttrbts() {
        if (undrlygFinInstrmAttrbts == null) {
            undrlygFinInstrmAttrbts = new ArrayList<>();
        }
        return this.undrlygFinInstrmAttrbts;
    }

    /**
     * Gets the value of the undrlygStiptns property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the undrlygStiptns property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUndrlygStiptns().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FinancialInstrumentStipulations }
     * 
     * 
     * @return
     *     The value of the undrlygStiptns property.
     */
    public List<FinancialInstrumentStipulations> getUndrlygStiptns() {
        if (undrlygStiptns == null) {
            undrlygStiptns = new ArrayList<>();
        }
        return this.undrlygStiptns;
    }

    /**
     * Gets the value of the instrmLegGrpDtls property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a {@code set} method for the instrmLegGrpDtls property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInstrmLegGrpDtls().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InstrumentLeg2 }
     * 
     * 
     * @return
     *     The value of the instrmLegGrpDtls property.
     */
    public List<InstrumentLeg2> getInstrmLegGrpDtls() {
        if (instrmLegGrpDtls == null) {
            instrmLegGrpDtls = new ArrayList<>();
        }
        return this.instrmLegGrpDtls;
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
     * Adds a new item to the finInstrmDtls list.
     * @see #getFinInstrmDtls()
     * 
     */
    public QuoteCancellation1Choice addFinInstrmDtls(SecurityIdentification7 finInstrmDtls) {
        getFinInstrmDtls().add(finInstrmDtls);
        return this;
    }

    /**
     * Adds a new item to the finInstrmAttrbts list.
     * @see #getFinInstrmAttrbts()
     * 
     */
    public QuoteCancellation1Choice addFinInstrmAttrbts(FinancialInstrumentAttributes1 finInstrmAttrbts) {
        getFinInstrmAttrbts().add(finInstrmAttrbts);
        return this;
    }

    /**
     * Adds a new item to the stiptns list.
     * @see #getStiptns()
     * 
     */
    public QuoteCancellation1Choice addStiptns(FinancialInstrumentStipulations stiptns) {
        getStiptns().add(stiptns);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmDtls list.
     * @see #getUndrlygFinInstrmDtls()
     * 
     */
    public QuoteCancellation1Choice addUndrlygFinInstrmDtls(SecurityIdentification7 undrlygFinInstrmDtls) {
        getUndrlygFinInstrmDtls().add(undrlygFinInstrmDtls);
        return this;
    }

    /**
     * Adds a new item to the undrlygFinInstrmAttrbts list.
     * @see #getUndrlygFinInstrmAttrbts()
     * 
     */
    public QuoteCancellation1Choice addUndrlygFinInstrmAttrbts(FinancialInstrumentAttributes1 undrlygFinInstrmAttrbts) {
        getUndrlygFinInstrmAttrbts().add(undrlygFinInstrmAttrbts);
        return this;
    }

    /**
     * Adds a new item to the undrlygStiptns list.
     * @see #getUndrlygStiptns()
     * 
     */
    public QuoteCancellation1Choice addUndrlygStiptns(FinancialInstrumentStipulations undrlygStiptns) {
        getUndrlygStiptns().add(undrlygStiptns);
        return this;
    }

    /**
     * Adds a new item to the instrmLegGrpDtls list.
     * @see #getInstrmLegGrpDtls()
     * 
     */
    public QuoteCancellation1Choice addInstrmLegGrpDtls(InstrumentLeg2 instrmLegGrpDtls) {
        getInstrmLegGrpDtls().add(instrmLegGrpDtls);
        return this;
    }

}
