
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;


/**
 * Class for colr.009.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "mrgnCallDsptNtfctn"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:colr.009.001.05")
public class MxColr00900105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "MrgnCallDsptNtfctn", required = true)
    protected MarginCallDisputeNotificationV05 mrgnCallDsptNtfctn;
    public static final transient String BUSINESS_PROCESS = "colr";
    public static final transient int FUNCTIONALITY = 9;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {ActiveCurrencyAndAmount.class, BlockChainAddressWallet5 .class, CollateralAccount3 .class, CollateralAccountIdentificationType3Choice.class, CollateralAccountType1Code.class, DateAndDateTime2Choice.class, Dispute1 .class, DisputeNotification2 .class, DisputeNotification2Choice.class, DisputeResolutionType1Choice.class, DisputeResolutionType1Code.class, DisputeResolutionType2Choice.class, DisputeResolutionType2Code.class, ExposureType11Code.class, GenericIdentification30 .class, GenericIdentification36 .class, MarginCallDisputeNotificationV05 .class, MxColr00900105 .class, NameAndAddress6 .class, Obligation9 .class, PartyIdentification178Choice.class, PostalAddress2 .class, SegregatedIndependentAmountDispute2 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class, VariationMarginDispute1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:colr.009.001.05";

    public MxColr00900105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxColr00900105(final String xml) {
        this();
        MxColr00900105 tmp = parse(xml);
        mrgnCallDsptNtfctn = tmp.getMrgnCallDsptNtfctn();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxColr00900105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the mrgnCallDsptNtfctn property.
     * 
     * @return
     *     possible object is
     *     {@link MarginCallDisputeNotificationV05 }
     *     
     */
    public MarginCallDisputeNotificationV05 getMrgnCallDsptNtfctn() {
        return mrgnCallDsptNtfctn;
    }

    /**
     * Sets the value of the mrgnCallDsptNtfctn property.
     * 
     * @param value
     *     allowed object is
     *     {@link MarginCallDisputeNotificationV05 }
     *     
     */
    public MxColr00900105 setMrgnCallDsptNtfctn(MarginCallDisputeNotificationV05 value) {
        this.mrgnCallDsptNtfctn = value;
        return this;
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
    public static MxColr00900105 parse(String xml) {
        return ((MxColr00900105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00900105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxColr00900105 parse(String xml, MxReadConfiguration conf) {
        return ((MxColr00900105) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxColr00900105 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxColr00900105 parse(String xml, MxRead parserImpl) {
        return ((MxColr00900105) parserImpl.read(MxColr00900105 .class, xml, _classes));
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
     * Creates an MxColr00900105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxColr00900105 message
     * @return
     *     a new instance of MxColr00900105
     */
    public static final MxColr00900105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxColr00900105 .class);
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

}
