
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
 * Class for seev.044.001.13 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntPrlimryAdvcCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.044.001.13")
public class MxSeev04400113
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntPrlimryAdvcCxlAdvc", required = true)
    protected CorporateActionMovementPreliminaryAdviceCancellationAdviceV13 corpActnMvmntPrlimryAdvcCxlAdvc;
    public static final transient String BUSINESS_PROCESS = "seev";
    public static final transient int FUNCTIONALITY = 44;
    public static final transient int VARIANT = 1;
    public static final transient int VERSION = 13;
    @SuppressWarnings("rawtypes")
    public static final transient Class[] _classes = new Class[] {AccountIdentification10 .class, AccountIdentification69 .class, AccountIdentification73Choice.class, AddressType2Code.class, CorporateAction71 .class, CorporateActionDate86 .class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat14Choice.class, CorporateActionEventType108Choice.class, CorporateActionEventType36Code.class, CorporateActionGeneralInformation177 .class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMandatoryVoluntary3Choice.class, CorporateActionMovementPreliminaryAdviceCancellationAdviceV13 .class, DateCode19Choice.class, DateFormat30Choice.class, DateType8Code.class, DocumentIdentification31 .class, GenericIdentification30 .class, GenericIdentification36 .class, GenericIdentification78 .class, IdentificationSource3Choice.class, LotteryType1Code.class, LotteryTypeFormat4Choice.class, MxSeev04400113 .class, NameAndAddress5 .class, OtherIdentification1 .class, PartyIdentification120Choice.class, PartyIdentification127Choice.class, PostalAddress1 .class, ProcessingPosition3Code.class, ProcessingPosition7Choice.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat42Choice.class, SafekeepingPlaceTypeAndIdentification1 .class, SafekeepingPlaceTypeAndText6 .class, SecurityIdentification19 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public static final transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.044.001.13";

    public MxSeev04400113() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04400113(final String xml) {
        this();
        MxSeev04400113 tmp = parse(xml);
        corpActnMvmntPrlimryAdvcCxlAdvc = tmp.getCorpActnMvmntPrlimryAdvcCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04400113(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntPrlimryAdvcCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementPreliminaryAdviceCancellationAdviceV13 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdviceV13 getCorpActnMvmntPrlimryAdvcCxlAdvc() {
        return corpActnMvmntPrlimryAdvcCxlAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntPrlimryAdvcCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementPreliminaryAdviceCancellationAdviceV13 }
     *     
     */
    public MxSeev04400113 setCorpActnMvmntPrlimryAdvcCxlAdvc(CorporateActionMovementPreliminaryAdviceCancellationAdviceV13 value) {
        this.corpActnMvmntPrlimryAdvcCxlAdvc = value;
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
    public static MxSeev04400113 parse(String xml) {
        return ((MxSeev04400113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04400113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams()));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML, using the provided unmarshalling options
     * @since 9.2.6
     * 
     */
    public static MxSeev04400113 parse(String xml, MxReadConfiguration conf) {
        return ((MxSeev04400113) com.prowidesoftware.swift.model.mx.MxReadImpl.parse(MxSeev04400113 .class, xml, _classes, new com.prowidesoftware.swift.model.mx.MxReadParams(conf)));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04400113 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04400113) parserImpl.read(MxSeev04400113 .class, xml, _classes));
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
     * Creates an MxSeev04400113 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04400113 message
     * @return
     *     a new instance of MxSeev04400113
     */
    public static final MxSeev04400113 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04400113 .class);
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
