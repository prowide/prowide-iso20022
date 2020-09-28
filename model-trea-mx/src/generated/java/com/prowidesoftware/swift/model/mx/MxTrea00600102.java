
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for trea.006.001.02 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "cclNDFValtnV02"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:trea.006.001.02")
public class MxTrea00600102
    extends AbstractMX
{

    @XmlElement(name = "CclNDFValtnV02", required = true)
    protected CancelNonDeliverableForwardValuationV02 cclNDFValtnV02;
    public final static transient String BUSINESS_PROCESS = "trea";
    public final static transient int FUNCTIONALITY = 6;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 2;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveOrHistoricCurrencyAndAmount.class, AddressType2Code.class, AgreedRate1 .class, AmountsAndValueDate1 .class, CancelNonDeliverableForwardValuationV02 .class, FundIdentification2 .class, MxTrea00600102 .class, NameAndAddress8 .class, PartyIdentification22 .class, PartyIdentification8Choice.class, PostalAddress1 .class, TradeAgreement2 .class, TradePartyIdentification3 .class, ValuationData2 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:trea.006.001.02";

    public MxTrea00600102() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxTrea00600102(final String xml) {
        this();
        MxTrea00600102 tmp = parse(xml);
        cclNDFValtnV02 = tmp.getCclNDFValtnV02();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxTrea00600102(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the cclNDFValtnV02 property.
     * 
     * @return
     *     possible object is
     *     {@link CancelNonDeliverableForwardValuationV02 }
     *     
     */
    public CancelNonDeliverableForwardValuationV02 getCclNDFValtnV02() {
        return cclNDFValtnV02;
    }

    /**
     * Sets the value of the cclNDFValtnV02 property.
     * 
     * @param value
     *     allowed object is
     *     {@link CancelNonDeliverableForwardValuationV02 }
     *     
     */
    public MxTrea00600102 setCclNDFValtnV02(CancelNonDeliverableForwardValuationV02 value) {
        this.cclNDFValtnV02 = value;
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
    public static MxTrea00600102 parse(String xml) {
        return ((MxTrea00600102) MxReadImpl.parse(MxTrea00600102 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxTrea00600102 parse(String xml, MxRead parserImpl) {
        return ((MxTrea00600102) parserImpl.read(MxTrea00600102 .class, xml, _classes));
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
     * Creates an MxTrea00600102 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxTrea00600102 message
     * @return
     *     a new instance of MxTrea00600102
     */
    public final static MxTrea00600102 fromJson(String json) {
        return AbstractMX.fromJson(json, MxTrea00600102 .class);
    }

}
