
package com.prowidesoftware.swift.model.mx;

import com.prowidesoftware.swift.model.mx.dic.*;
import com.prowidesoftware.swift.model.mx.AbstractMX;

import com.prowidesoftware.swift.model.MxSwiftMessage;
import com.prowidesoftware.swift.model.mx.AbstractMX;
import com.prowidesoftware.swift.model.mx.MxRead;
import com.prowidesoftware.swift.model.mx.MxReadConfiguration;
import com.prowidesoftware.swift.model.mx.MxReadImpl;
import com.prowidesoftware.swift.model.mx.MxReadParams;
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
 * Class for setr.049.001.03 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "sbcptBlkOrdrConfCxlInstr"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:setr.049.001.03")
public class MxSetr04900103
    extends AbstractMX
{

    @XmlElement(name = "SbcptBlkOrdrConfCxlInstr", required = true)
    protected SubscriptionBulkOrderConfirmationCancellationInstructionV03 sbcptBlkOrdrConfCxlInstr;
    public static final transient String BUSINESS_PROCESS = "setr";
    public static final transient int FUNCTIONALITY = 49;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 3;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AdditionalReference10 .class, AdditionalReference11 .class, AddressType2Code.class, CancellationReason31Choice.class, ConfirmationCancellationReason1Code.class, CopyInformation5 .class, GenericIdentification1 .class, GenericIdentification47 .class, InvestmentFundOrder14 .class, MessageIdentification1 .class, MxSetr04900103 .class, NameAndAddress5 .class, PartyIdentification125Choice.class, PartyIdentification139 .class, PostalAddress1 .class, SubscriptionBulkOrderConfirmationCancellationInstructionV03 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:setr.049.001.03";

    public MxSetr04900103() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSetr04900103(final String xml) {
        this();
        MxSetr04900103 tmp = parse(xml);
        sbcptBlkOrdrConfCxlInstr = tmp.getSbcptBlkOrdrConfCxlInstr();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSetr04900103(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the sbcptBlkOrdrConfCxlInstr property.
     * 
     * @return
     *     possible object is
     *     {@link SubscriptionBulkOrderConfirmationCancellationInstructionV03 }
     *     
     */
    public SubscriptionBulkOrderConfirmationCancellationInstructionV03 getSbcptBlkOrdrConfCxlInstr() {
        return sbcptBlkOrdrConfCxlInstr;
    }

    /**
     * Sets the value of the sbcptBlkOrdrConfCxlInstr property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubscriptionBulkOrderConfirmationCancellationInstructionV03 }
     *     
     */
    public MxSetr04900103 setSbcptBlkOrdrConfCxlInstr(SubscriptionBulkOrderConfirmationCancellationInstructionV03 value) {
        this.sbcptBlkOrdrConfCxlInstr = value;
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
    public static MxSetr04900103 parse(String xml) {
        return ((MxSetr04900103) MxReadImpl.parse(MxSetr04900103 .class, xml, _classes, new MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSetr04900103 parse(String xml, MxReadConfiguration conf) {
        return ((MxSetr04900103) MxReadImpl.parse(MxSetr04900103 .class, xml, _classes, new MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSetr04900103 parse(String xml, MxRead parserImpl) {
        return ((MxSetr04900103) parserImpl.read(MxSetr04900103 .class, xml, _classes));
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
     * Creates an MxSetr04900103 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSetr04900103 message
     * @return
     *     a new instance of MxSetr04900103
     */
    public static final MxSetr04900103 fromJson(String json) {
        return AbstractMX.fromJson(json, MxSetr04900103 .class);
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
