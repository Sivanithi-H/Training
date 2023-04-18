package com.mapper.demomapper.mapper;

import com.mapper.demomapper.dto.CommerceDto;
import com.mapper.demomapper.entity.Commerce;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CommerceMapper {

    CommerceMapper INSTANCE = Mappers.getMapper(CommerceMapper.class);

    @Mapping(source = "commerce.promotionCode", target = "code")
    CommerceDto modelToDto(Commerce commerce);

    List<CommerceDto> modelToDtos(List<Commerce> commerces);

    @InheritInverseConfiguration
    Commerce dtoToModel(CommerceDto commerceDto);
}
