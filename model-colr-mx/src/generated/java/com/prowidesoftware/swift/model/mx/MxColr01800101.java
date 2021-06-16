
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.018.001.01 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "xcssCshMrgnInstrStsAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:DRAFT1colr.018.001.01")
public class MxColr01800101
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "XcssCshMrgnInstrStsAdvc", required = true)
    protected ExcessCashMarginInstructionStatusAdviceV01 xcssCshMrgnInstrStsAdvc;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 18;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 1;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, AmountAndDirection52 .class, CreditDebitCode.class, ExcessCashAcceptedStatus1Choice.class, ExcessCashInstructionHeader2 .class, ExcessCashInstructionStatus1Choice.class, ExcessCashMarginInstructionStatusAdviceV01 .class, ExcessCashRejectionReason1Code.class, ExcessCassRejectionStatus1Choice.class, MarginSettlementAmount1 .class, MxColr01800101 .class, NoReasonCode.class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:DRAFT1colr.018.001.01";

    public MxColr01800101() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr01800101(final String xml) {
        this();
        MxColr01800101 tmp = parse(xml);
        xcssCshMrgnInstrStsAdvc = tmp.getXcssCshMrgnInstrStsAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr01800101(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the xcssCshMrgnInstrStsAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link ExcessCashMarginInstructionStatusAdviceV01 }
     *     
     */
    public ExcessCashMarginInstructionStatusAdviceV01 getXcssCshMrgnInstrStsAdvc() {
        return xcssCshMrgnInstrStsAdvc;
    }

    /**
     * Sets the value of the xcssCshMrgnInstrStsAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExcessCashMarginInstructionStatusAdviceV01 }
     *     
     */
    public MxColr01800101 setXcssCshMrgnInstrStsAdvc(ExcessCashMarginInstructionStatusAdviceV01 value) {
        this.xcssCshMrgnInstrStsAdvc = value;
        return this;
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

    @Override
    public String getBusinessProcess() {
        return BUSINESS_PROCESS;
    }

    @Override
    public int getFunctionality() {
        return FUNCTIONALITY;
    }

    @Override
    public int getVariant() {
        return VARIANT;
    }

    @Override
    public int getVersion() {
        return VERSION;
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML
     * 
     */
    public static MxColr01800101 parse(String xml) {
        return ((MxColr01800101) MxReadImpl.parse(MxColr01800101 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr01800101 parse(String xml, MxRead parserImpl) {
        return ((MxColr01800101) parserImpl.read(MxColr01800101 .class, xml, _classes));
    }

    @Override
    public String getNamespace() {
        return NAMESPACE;
    }

    @Override
    @SuppressWarnings("rawtypes")
    public Class[] getClasses() {
        return _classes;
    }

    /**
     * Creates an MxColr01800101 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr01800101 message
     * @return
     *     a new instance of MxColr01800101
     */
    public final static MxColr01800101 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr01800101 .class);
    }

}
