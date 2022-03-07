
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
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.009.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mrgnCallDsptNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.009.001.03")
public class MxColr00900103
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MrgnCallDsptNtfctn", required = true)
    protected MarginCallDisputeNotificationV03 mrgnCallDsptNtfctn;
    public final static transient String BUSINESS_PROCESS = "colr";
    public final static transient int FUNCTIONALITY = 9;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, CollateralAccount1 .class, CollateralAccountIdentificationType1Choice.class, CollateralAccountType1Code.class, DateAndDateTimeChoice.class, Dispute1 .class, DisputeNotification1 .class, DisputeNotification1Choice.class, DisputeResolutionType1Choice.class, DisputeResolutionType1Code.class, DisputeResolutionType2Choice.class, DisputeResolutionType2Code.class, ExposureType5Code.class, GenericIdentification29 .class, GenericIdentification30 .class, MarginCallDisputeNotificationV03 .class, MxColr00900103 .class, NameAndAddress6 .class, Obligation3 .class, PartyIdentification33Choice.class, PostalAddress2 .class, SegregatedIndependentAmountDispute1 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, VariationMarginDispute1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.009.001.03";

    public MxColr00900103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00900103(final String xml) {
        this();
        MxColr00900103 tmp = parse(xml);
        mrgnCallDsptNtfctn = tmp.getMrgnCallDsptNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00900103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mrgnCallDsptNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCallDisputeNotificationV03 }
     *     
     */
    public MarginCallDisputeNotificationV03 getMrgnCallDsptNtfctn() {
        return mrgnCallDsptNtfctn;
    }

    /**
     * Sets the value of the mrgnCallDsptNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCallDisputeNotificationV03 }
     *     
     */
    public MxColr00900103 setMrgnCallDsptNtfctn(MarginCallDisputeNotificationV03 value) {
        this.mrgnCallDsptNtfctn = value;
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
     * Creates the MX object parsing the raw content from the parameter XML, using default unmarshalling options
     * 
     */
    public static MxColr00900103 parse(String xml) {
        return ((MxColr00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr00900103 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr00900103) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00900103 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00900103 parse(String xml, MxRead parserImpl) {
        return ((MxColr00900103) parserImpl.read(MxColr00900103 .class, xml, _classes));
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
     * Creates an MxColr00900103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00900103 message
     * @return
     *     a new instance of MxColr00900103
     */
    public final static MxColr00900103 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr00900103 .class);
    }

}
