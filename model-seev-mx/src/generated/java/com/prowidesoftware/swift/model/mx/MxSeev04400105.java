
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
 * Class for seev.044.001.05 ISO 20022 message.
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Document", propOrder = {
    "corpActnMvmntPrlimryAdvcCxlAdvc"
})
@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.044.001.05")
public class MxSeev04400105
    extends com.prowidesoftware.swift.model.mx.AbstractMX
{

    @XmlElement(name = "CorpActnMvmntPrlimryAdvcCxlAdvc", required = true)
    protected CorporateActionMovementPreliminaryAdviceCancellationAdviceV05 corpActnMvmntPrlimryAdvcCxlAdvc;
    public final static transient String BUSINESS_PROCESS = "seev";
    public final static transient int FUNCTIONALITY = 44;
    public final static transient int VARIANT = 1;
    public final static transient int VERSION = 5;
    @SuppressWarnings("rawtypes")
    public final static transient Class[] _classes = new Class[] {AccountIdentification10 .class, AccountIdentification13Choice.class, AccountIdentification15 .class, AddressType2Code.class, CorporateAction13 .class, CorporateActionDate30 .class, CorporateActionEventStage4Code.class, CorporateActionEventStageFormat6Choice.class, CorporateActionEventType13Code.class, CorporateActionEventType14Choice.class, CorporateActionGeneralInformation53 .class, CorporateActionMandatoryVoluntary1Choice.class, CorporateActionMandatoryVoluntary1Code.class, CorporateActionMovementPreliminaryAdviceCancellationAdviceV05 .class, DateAndDateTimeChoice.class, DateCode11Choice.class, DateFormat19Choice.class, DateType8Code.class, DocumentIdentification15 .class, GenericIdentification19 .class, GenericIdentification20 .class, GenericIdentification21 .class, IdentificationSource3Choice.class, LotteryType1Code.class, LotteryTypeFormat1Choice.class, MxSeev04400105 .class, NameAndAddress5 .class, OtherIdentification1 .class, PartyIdentification36Choice.class, PartyIdentification46Choice.class, PostalAddress1 .class, ProcessingPosition1Choice.class, ProcessingPosition3Code.class, SafekeepingAccountIdentification1Code.class, SafekeepingPlace1Code.class, SafekeepingPlace2Code.class, SafekeepingPlaceFormat2Choice.class, SafekeepingPlaceTypeAndAnyBICIdentifier1 .class, SafekeepingPlaceTypeAndText2 .class, SecurityIdentification14 .class, SupplementaryData1 .class, SupplementaryDataEnvelope1 .class };
    public final static transient String NAMESPACE = "urn:iso:std:iso:20022:tech:xsd:seev.044.001.05";

    public MxSeev04400105() {
        super();
    }

    /**
     * Creates the MX object parsing the parameter String with the XML content
     * 
     */
    public MxSeev04400105(final String xml) {
        this();
        MxSeev04400105 tmp = parse(xml);
        corpActnMvmntPrlimryAdvcCxlAdvc = tmp.getCorpActnMvmntPrlimryAdvcCxlAdvc();
    }

    /**
     * Creates the MX object parsing the raw content from the parameter MxSwiftMessage
     * 
     */
    public MxSeev04400105(final MxSwiftMessage mxSwiftMessage) {
        this(mxSwiftMessage.message());
    }

    /**
     * Gets the value of the corpActnMvmntPrlimryAdvcCxlAdvc property.
     * 
     * @return
     *     possible object is
     *     {@link CorporateActionMovementPreliminaryAdviceCancellationAdviceV05 }
     *     
     */
    public CorporateActionMovementPreliminaryAdviceCancellationAdviceV05 getCorpActnMvmntPrlimryAdvcCxlAdvc() {
        return corpActnMvmntPrlimryAdvcCxlAdvc;
    }

    /**
     * Sets the value of the corpActnMvmntPrlimryAdvcCxlAdvc property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorporateActionMovementPreliminaryAdviceCancellationAdviceV05 }
     *     
     */
    public MxSeev04400105 setCorpActnMvmntPrlimryAdvcCxlAdvc(CorporateActionMovementPreliminaryAdviceCancellationAdviceV05 value) {
        this.corpActnMvmntPrlimryAdvcCxlAdvc = value;
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
    public static MxSeev04400105 parse(String xml) {
        return ((MxSeev04400105) MxReadImpl.parse(MxSeev04400105 .class, xml, _classes));
    }

    /**
     * Creates the MX object parsing the raw content from the parameter XML with injected read implementation
     * @since 9.0.1
     * 
     * @param parserImpl an MX unmarshall implementation
     */
    public static MxSeev04400105 parse(String xml, MxRead parserImpl) {
        return ((MxSeev04400105) parserImpl.read(MxSeev04400105 .class, xml, _classes));
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
     * Creates an MxSeev04400105 messages from its JSON representation.
     * <p>
     * For generic conversion of JSON into the corresponding MX instance 
     * see {@link AbstractMX#fromJson(String)}
     * 
     * @since 7.10.2
     * 
     * @param json a JSON representation of an MxSeev04400105 message
     * @return
     *     a new instance of MxSeev04400105
     */
    public final static MxSeev04400105 fromJson(String json) {
        return com.prowidesoftware.swift.model.mx.AbstractMX.fromJson(json, MxSeev04400105 .class);
    }

}
